package webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.HolaMundoSoap")
public class HolaMundoSoapImpl implements HolaMundoSoap {

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

	@Override
	public String despedir(String nombre) {
		return "Chao " + nombre;
	}

}
