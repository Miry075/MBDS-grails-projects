package users

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import models.users.User

@CompileStatic
class UserService {

    @Transactional(readOnly = true)
    List<User> findUsers(Map params) {
        User.list(params)
    }

    @Transactional(readOnly = true)
    User findByUsername(String username) {
        User.get(username)
    }

    @Transactional
    void save(String username, String password, String lastName, String firstName, String email, String img) {
        User user = new User(
                username: username,
                password: password,
                lastName: lastName,
                firstName: firstName,
                email: email,
                recordDate: new Date(),
                isConnected: false,
                img: img
        )
        user.save(flush: true, failOnError: true)
        print("user $user.username saved successfuly")
    }
}
