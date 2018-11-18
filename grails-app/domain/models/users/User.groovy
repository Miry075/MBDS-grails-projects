package models.users

class User {
    static mapping = {
        table "Users"
        autowire true
    }

    String username
    String password
    String email
    String firstName
    String lastName
    Integer age
    Date dateOfBirth

    static constraints = {
        username        nullable:false, unique: true, blank:false
        password        nullable:false
        email           nullable:false
        lastName        nullable:false
        firstName       nullable:false
    }



}
