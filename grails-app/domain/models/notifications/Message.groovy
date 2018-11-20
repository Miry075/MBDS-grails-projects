package models.notifications

import models.users.User

class Message {

    User sender
    User receiver
    String contents
    Date recordDate
    Date readDate
    Boolean isDeleted
    Boolean isReaded

    static mapping = {
        table '`messages`'
    }

    static constraints = {
        contents nullable: false
        recordDate default: new Date()
        isReaded default: false
        isDeleted default: false
        readDate nullable: true
    }
}
