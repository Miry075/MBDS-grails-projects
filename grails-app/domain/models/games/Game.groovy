package models.games

class Game {

    String description
    Date gameDate
    Date recordDate
    static hasMany = [challengers: Team]


    static constraints = {
        description nullable: false, blank: false
        recordDate default: new Date()
    }

    static mapping = {
        table '`games`'
        challengers fetch: 'join', joinTable: [name: 'challengers', key:'id', column:'challengers']
    }
}
