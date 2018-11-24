package models.games

import models.users.User

class Team {

    String name
    Date recordDate

    static hasMany = [members: User]

    /*Set<User> getMembers(){
        members.findAllByKey(this)*.members as Set<User>
    }*/

    static constraints = {
        recordDate default: new Date()
    }

    static mapping = {
        table '`teams`'
        members lazy: false
        members joinTable: [name: 'members', key:'id', column:'members']
    }
}
