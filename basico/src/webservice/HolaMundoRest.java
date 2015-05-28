package webservice;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import webservice.request.DespedirRequest;
import webservice.response.DespedirResponse;

@Produces("application/json")
public interface HolaMundoRest {
	@GET
	@Path("/saludar/{nombre}")
	Map<String, String> saludar(@PathParam("nombre") String nombre);
	
	@POST
	@Path("/despedir")
	@Consumes("application/json")
	DespedirResponse despedir(DespedirRequest despedirRequest);
}
