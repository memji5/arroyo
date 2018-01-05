package test

class Cliente {

	String nombre
	String paterno
	int edad
	String materno

    static constraints = {
    	nombre nullable:true
    	paterno nullable:true
    	edad nullable:true
    	materno nullable:true
    }

    static mapping={
    	table 'tbl_cliente'
    	id column:'clt_id'
    	paterno column:'clt_paterno'
    	materno column:'clt_materno'
    	edad column:'clt_edad'
    	version false
    }
}
