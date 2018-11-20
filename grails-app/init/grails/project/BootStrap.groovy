package grails.project

import models.users.Role
import models.users.User
import models.users.UserRole
import users.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->

       /* def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def testUser1 = new User(
                username: 'miry',
                password:'activation').save()


        def testUser2 = new User(
                username: 'lai',
                password:'password').save()

        UserRole.create testUser1, adminRole
        UserRole.create testUser2, adminRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

        assert User.count() == 2
        assert Role.count() == 1
        assert UserRole.count() == 2*/
    }

    def destroy = {
    }
}
