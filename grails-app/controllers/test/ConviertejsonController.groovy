package test

import grails.converters.JSON

class ConviertejsonController {

    def index() {
    	
    		def persona=[
    			nombre:"arroyo test",
    			edad:"20",
    			telefono:"1234567"
    			]
    		def domicilio=[
    			colonia:"colonia",
    			cp:"67809876",
    			id:"1",
    			numero:"233-4",
    			calle:"test"
    			]
    		def datos=[
    			agenda:"agenda 1",
    			datos:[persona,domicilio]]
    	render datos as JSON

    	def json=datos as JSON
    	def fileName="archivo"
    	json.prettyPrint = true
		response.setHeader("Content-disposition","attachment;filename= ${fileName}");
		response.setContentType("application/json");
		response.outputStream << json
     }
}
