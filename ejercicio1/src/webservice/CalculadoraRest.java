package webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import webservice.request.CalculadoraRequest;
import webservice.response.JsonResponse;

@Produces("application/json")
@Consumes("application/json")
public interface CalculadoraRest {
	@POST
	@Path("")
	public JsonResponse calcular(CalculadoraRequest calculadoraRequest);
}

