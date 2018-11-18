package grails.project

import users.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->
        def date = new Date()
        userService.save(
                "Miry",
                "activation",
                "Mirindra",
                "Hery",
                "hery.mirindra@outlook.com",
                date,
                21
        )
    }
    def destroy = {
    }
}
