import grails.project.BootStrap
import users.UserService

// Place your Spring DSL code here
beans = {
    bootStrap(BootStrap) {
        userService = ref('userService')
    }

    userService(UserService){

    }
}
