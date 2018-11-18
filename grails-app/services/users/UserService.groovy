package users

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import models.users.User

@CompileStatic
class UserService {

    @Transactional
    void save(String username, String password, String firstName, String lastName, String email, Date dateOfBirth) {
        User user = new User(
                username: username,
                password: password,
                firstName: firstName,
                lastName: lastName,
                email: email,
                dateOfBirth: dateOfBirth
        )
        user.save()
        print ("user $user.username")
    }
}
