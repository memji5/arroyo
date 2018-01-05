package test

class Ship {
	int pasajeros
	String nombre


    static constraints = {
    	pasajeros nullable:true
    	nombre nullable:true
    }

    static mapping={
    	table 'tbl_ship'
    	id column:'ship_id'
    	nombre column:'ship_nombre'
    	version false
    }
}
