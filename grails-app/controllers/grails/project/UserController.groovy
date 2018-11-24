package grails.project

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.multipart.MultipartHttpServletRequest

class UserController {

    def userService

    def index() {}

    @Secured(value = ["hasRole('ROLE_ADMIN')"])
    def formUser() {}

    def userDetails() {}

    def findUsers() {
        userService.findUsers(params)
    }

    def findByUsername() {
        userService.findByUsername(params['username'].toString())
    }

    @Secured(value = ["hasRole('ROLE_ADMIN')"], httpMethod = 'POST')
    def save() {

        print("save user controller $params")
        def multiparthttpRequest = (MultipartHttpServletRequest) request
        def file = multiparthttpRequest.getFile('img')
        if (!file.empty) {
            flash.message = 'success'
            print "success"
        } else {
            flash.message = 'file cannot be empty'
            print "failed"
        }

        def recordDate = new Date()
        userService.save(
                params["username"].toString(),
                params["password"].toString(),
                params["lastname"].toString(),
                params["firstname"].toString(),
                params["email"].toString(),
                file.getOriginalFilename()

        )

        render(view: 'index')
    }
}
