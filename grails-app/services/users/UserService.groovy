package users

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import models.users.User

@CompileStatic
class UserService {

    @Transactional
    void save(String username, String password, String firstName, String lastName, String email, Integer age, Date dateOfBirth) {
        print "save user $username"
        User user = new User(
                username: username,
                password: password,
                firstName: firstName,
                lastName: lastName,
                email: email,
                age: age,
                dateOfBirth: dateOfBirth
        )
        user.save(flush :true, failOnError:true)
        print ("user $user.username saved successfuly")
    }
}
