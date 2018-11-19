package grails.project

import models.users.Role
import models.users.User
import models.users.UserRole
import users.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def testUser = new User(username: 'me', password: 'password').save()

        UserRole.create testUser, adminRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

        assert User.count() == 1
        assert Role.count() == 1
        assert UserRole.count() == 1
    }

    def destroy = {
    }
}
