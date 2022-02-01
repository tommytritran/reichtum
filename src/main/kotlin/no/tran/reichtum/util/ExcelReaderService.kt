package no.tran.reichtum.util

import no.tran.reichtum.data.*
import no.tran.reichtum.service.*
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.springframework.stereotype.Service
import java.io.FileInputStream

@Service
class ExcelReaderService(
    val ageRangeService: AgeRangeService,
    val employeeTypeService: EmployeeTypeService,
    val occupationService: OccupationService,
    val regionService: RegionService,
    val sectorService: SectorService,
    val userService: UserService,
    val excelHelper: ExcelHelper
) {

    fun mapExcelToDB(path:String):Map<String, Any> {
        val data = mutableMapOf<String, Any>()

        val xlwb = getWorkbook(path)
        val sheet = xlwb.getSheetAt(0)

        //Start iterating at index 1, since index 0 is header
        var index = 1
        var row = sheet.getRow(index)

        var users = mutableListOf<User>()

        var ageRanges = ageRangeService.getAllAgeRanges().toMutableList()
        var employeeTypes = employeeTypeService.getAllEmployeeTypes().toMutableList()
        var occupations = occupationService.getAllOccupations().toMutableList()
        var regions = regionService.getAllRegion().toMutableList()
        var sectors = sectorService.getAllSectors().toMutableList()

        while (row != null) {
            try {
                val ageRangeString = excelHelper.parseAgeRange(row.getCell(0).stringCellValue)
                val regionString = row.getCell(1).stringCellValue.lowercase()
                val employeeTypeString = excelHelper.parseEmployeeType(row.getCell(2).stringCellValue)
                val sectorString = excelHelper.parseSector(row.getCell(3).stringCellValue)
                val experience = row.getCell(5).numericCellValue.toInt()
                val occupationString = row.getCell(6).stringCellValue.lowercase()
                val salary = row.getCell(8).numericCellValue
                val bonus = row.getCell(11).stringCellValue.lowercase() == "ja"

                var ageRange = AgeRange(null, ageRangeString)
                var region = Region(null, regionString)
                var employeeType = EmployeeType(null, employeeTypeString)
                var sector = Sector(null, sectorString)
                var occupation = Occupation(null, occupationString)
                if (ageRanges.find { it.name.equals(ageRange.name) } == null){
                    ageRange = ageRangeService.addAgeRange(ageRange)
                    ageRanges.add(ageRange)
                } else {
                    ageRange = ageRanges.find { it.name.equals(ageRange.name) }!!
                }
                if (regions.find { it.name.equals(region.name) } == null) {
                    region = regionService.addRegion(region)
                    regions.add(region)
                } else {
                    region = regions.find { it.name.equals(region.name) }!!
                }
                if (employeeTypes.find { it.name.equals(employeeType.name) } == null) {
                    employeeType = employeeTypeService.addEmployeeType(employeeType)
                    employeeTypes.add(employeeType)
                } else {
                    employeeType = employeeTypes.find { it.name.equals(employeeType.name) }!!
                }
                if (sectors.find { it.name.equals(sector.name) } == null) {
                    sector = sectorService.addSector(sector)
                    sectors.add(sector)
                } else {
                    sector = sectors.find { it.name.equals(sector.name) }!!
                }
                if (occupations.find { it.name.equals(occupation.name) } == null) {
                    occupation = occupationService.addOccupation(occupation)
                    occupations.add(occupation)
                } else {
                    occupation = occupations.find { it.name.equals(occupation.name) }!!
                }
                var user = User(
                    null,
                    region,
                    employeeType,
                    sector,
                    ageRange,
                    experience,
                    occupation,
                    salary,
                    bonus
                )
                user = userService.addUser(user)
                users.add(user)
                row = sheet.getRow(++index)
            }catch (e:NullPointerException) {
                println("Empty row")
                break
            }
        }

        data["rows"] = index
        data["users"] = users
        return data
    }

    fun getWorkbook(path:String):Workbook {
        val inputStream = FileInputStream(path)
        return WorkbookFactory.create(inputStream)
    }

}
