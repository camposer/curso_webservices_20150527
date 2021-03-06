package cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.HolaMundoSoap;

public class ClienteHolaMundo {
	private ApplicationContext ctx;
	
	public ClienteHolaMundo() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public void iniciar() {
		HolaMundoSoap holaMundoSoap = 
				ctx.getBean("holaMundoSoapClient", HolaMundoSoap.class);
		
		String nombre = "Rodolfo";
		System.out.println(holaMundoSoap.saludar(nombre));
		System.out.println(holaMundoSoap.despedir(nombre));
	}
	
	public static void main(String[] args) {
		new ClienteHolaMundo().iniciar();
	}
}
