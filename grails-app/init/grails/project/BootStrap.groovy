package grails.project

import models.games.Game
import models.games.Team
import models.users.Role
import models.users.User
import models.users.UserRole
import users.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->

        for (Team item : Team.getAll()) {
            System.out.println(item.name)
            for (def user : item.members) {
                print "print: $item.name => $user.username"
            }
        }

        for (def game : Game.getAll()) {
            System.out.println(game.description)
            System.out.println(game.list(fetch: [challengers: 'join']))
            game.list(fetch: [challengers: 'join']).each { a ->
                print "challenger $a.challengers"
                for (Team team : a.challengers) {
                    print "print game: $game.description => $team.name"
                }
            }

        }

        /*def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def playerRole = new Role(authority: 'ROLE_PLAYER').save()

        def adminUser1 = new User(
                username: 'miry',
                password: 'activation',
                lastName: 'Hery',
                firstName: 'Mirindra',
                email: 'hery.mirindra@outlook.com',
                recordDate: new Date(),
                isConnected: false
        ).save()

        def adminUser2 = new User(
                username: 'lai',
                password: 'password',
                lastName: 'Lai',
                firstName: 'Christophe',
                email: 'lai_christophe@hotmail.com',
                recordDate: new Date(),
                isConnected: false
        ).save()

        def playerUser1 = new User(
                username: 'bot1',
                password: 'bot123',
                lastName: 'Bot1',
                firstName: 'Player',
                email: 'hery.mirindra@outlook.com',
                recordDate: new Date(),
                isConnected: false
        ).save()

        def playerUser2 = new User(
                username: 'bot2',
                password: 'bot123',
                lastName: 'Bot2',
                firstName: 'Player',
                email: 'hery.mirindra@outlook.com',
                recordDate: new Date(),
                isConnected: false
        ).save()

        def playerUser3 = new User(
                username: 'bot3',
                password: 'bot123',
                lastName: 'Bot3',
                firstName: 'Player',
                email: 'hery.mirindra@outlook.com',
                recordDate: new Date(),
                isConnected: false
        ).save()

        def playerUser4 = new User(
                username: 'bot4',
                password: 'bot123',
                lastName: 'Bot4',
                firstName: 'Player',
                email: 'hery.mirindra@outlook.com',
                recordDate: new Date(),
                isConnected: false
        ).save()


        def team1 = new Team(
                name: 'B6K',
                recordDate: new Date()
        ).addToMembers(adminUser1).addToMembers(playerUser1).save(failOnError: true)

        def team2 = new Team(
                name: 'Punisher',
                recordDate: new Date()
        ).addToMembers(adminUser2).addToMembers(playerUser2).save(failOnError: true)

        def team3 = new Team(
                name: 'BBCM',
                recordDate: new Date()
        ).addToMembers(playerUser3).addToMembers(playerUser4).save(failOnError: true)

        def game1 = new Game(
                description: 'game of the century hahaha',
                gameDate: new Date().parse('yyyy/MM/dd', '2018/12/23'),
                recordDate: new Date()
        ).addToChallengers(team1).addToChallengers(team2).addToChallengers(team3).save(failOnError: true)

        UserRole.create adminUser1, adminRole

        UserRole.create adminUser2, adminRole

        UserRole.create playerUser1, playerRole

        UserRole.create playerUser2, playerRole

        UserRole.create playerUser3, playerRole

        UserRole.create playerUser4, playerRole


        UserRole.withSession {
            it.flush()
            it.clear()
        }*/

        /*assert User.count() == 6
        assert Role.count() == 2
        assert UserRole.count() == 6*/
    }

    def destroy = {
    }
}
