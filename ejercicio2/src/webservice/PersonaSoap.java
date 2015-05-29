package webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import model.Persona;

import org.springframework.beans.factory.annotation.Autowired;

import service.PersonaService;

@WebService(serviceName = "PersonSoap")
public class PersonaSoap {
	@Autowired
	private PersonaService personaService;
	
	@WebMethod(operationName = "addPerson")
	public void agregarPersona(@WebParam(name = "person") Persona p) {
		personaService.agregarPersona(p);
	}

	@WebMethod(operationName = "updatePerson")
	public void modificarPersona(@WebParam(name = "person") Persona p) {
		personaService.modificarPersona(p);		
	}
	
	@WebMethod(operationName = "removePerson")
	public void eliminarPersona(@WebParam(name = "id") Integer id) {
		personaService.eliminarPersona(id);
	}
	
	@WebMethod(operationName = "findPerson")
	public Persona obtenerPersona(@WebParam(name = "id") Integer id) {
		return personaService.obtenerPersona(id);
	}
	
	@WebMethod(operationName = "findPersons")
	public List<Persona> obtenerPersonas() {
		return personaService.obtenerPersonas();
	}
}
