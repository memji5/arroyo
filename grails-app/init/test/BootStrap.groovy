package test

import test.Ship


class BootStrap {

    def init = { servletContext ->

    	5.times {i -> new Ship(nombre: "Ship  ${i+1}", pasajeros:i+1).save(flush:true, failOnError:true) }
    }
    def destroy = {
    }
}
