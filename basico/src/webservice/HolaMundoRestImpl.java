package webservice;

import java.util.Hashtable;
import java.util.Map;

import webservice.request.DespedirRequest;
import webservice.response.DespedirResponse;

public class HolaMundoRestImpl implements HolaMundoRest {

	@Override
	public Map<String, String> saludar(String nombre) {
		return new Hashtable<String, String>() {{
			put("nombre", "Hola " + nombre);
		}};
	}

	@Override
	public DespedirResponse despedir(DespedirRequest despedirRequest) {
		return new DespedirResponse("Chao " + despedirRequest.getNombre());
	}

}
