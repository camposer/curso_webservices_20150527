package webservice;

import javax.jws.WebService;

@WebService
public interface HolaMundoSoap {
	String saludar(String nombre);
	String despedir(String nombre);
}
