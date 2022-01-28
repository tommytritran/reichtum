package no.tran.reichtum.service

import no.tran.reichtum.data.User
import no.tran.reichtum.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserService (private val UserRepository:UserRepository) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun getAllUser():List<User> {
        log.info("About to get all users")
        return UserRepository.findAll();
    }

    fun addUser(user:User):User{
        log.info("About to save user")
        return UserRepository.save(user)
    }
}
