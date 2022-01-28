package no.tran.reichtum.controller

import no.tran.reichtum.data.User
import no.tran.reichtum.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController (private val userService:UserService) {

    @GetMapping("/users")
    fun getAllUsers():List<User>{
        return userService.getAllUser()
    }

    @PostMapping()
    fun addUser(@RequestBody user:User):User{
        return userService.addUser(user)
    }
}
