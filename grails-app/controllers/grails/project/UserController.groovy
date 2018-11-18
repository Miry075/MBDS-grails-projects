package grails.project

class UserController {

    def userService

    def index() { }

    def save() {
        def date = new Date()
        userService.save(
                "Miry",
                "activation",
                "Mirindra",
                "Hery",
                "hery.mirindra@outlook.com",
                date
        )
        render(view: 'index')

    }
}
