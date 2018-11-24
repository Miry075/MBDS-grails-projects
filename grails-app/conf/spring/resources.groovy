import models.users.UserPasswordEncoderListener
import grails.project.BootStrap
import models.users.UserPasswordEncoderListener
import users.UserService

// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))

    bootStrap(BootStrap) {
        userService = ref('userService')
    }

    userService(UserService)

    userPasswordEncoderListener(UserPasswordEncoderListener)
}
