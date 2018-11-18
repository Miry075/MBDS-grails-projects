package grails.project

class UserController {

    def userService

    def index() { }

    def formUser(){}

    def save() {
        def date = new Date()
        userService.save(
                "Lai",
                "lai",
                "Lai",
                "Christphe",
                "hery.mirindra@outlook.com",
                23,
                date
        )
        render(view: 'index')

    }
}
