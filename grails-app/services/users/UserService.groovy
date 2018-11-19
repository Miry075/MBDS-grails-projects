package users

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import models.users.User

@CompileStatic
class UserService {

    @Transactional
    void save(String username, String password) {
        print "save user $username"
        User user = new User(
                username: username,
                password: password,
        )
        user.save(flush :true, failOnError:true)
        print ("user $user.username saved successfuly")
    }
}
