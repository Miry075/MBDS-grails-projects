package grails.project

class UserController {

    def userService

    def index() { }

    def formUser(){}

    def save() {
        def date = new Date()
        userService.save(
                "Miry",
                "activation",
        )
        render(view: 'index')

    }
}
