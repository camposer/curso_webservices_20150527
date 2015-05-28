package webservice.response;

public class DespedirResponse {
	private String mensaje;

	public DespedirResponse(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
