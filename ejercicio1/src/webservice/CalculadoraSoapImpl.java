package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import service.CalculadoraService;

@WebService(targetNamespace  = "calculadora.webservice")
/*(endpointInterface = "webservice.CalculadoraSoap")*/
public class CalculadoraSoapImpl /*implements CalculadoraSoap*/ {
	@Autowired
	private CalculadoraService calculadoraService;

//	@Override
	@WebMethod(operationName = "sum")
	public float sumar(
			@WebParam(name = "a") float a, 
			@WebParam(name = "b") float b) {
		return calculadoraService.sumar(a, b);
	}

//	@Override
	@WebMethod(exclude = true)
	public float restar(float a, float b) {
		return calculadoraService.restar(a, b);
	}

//	@Override
	public float multiplicar(float a, float b) {
		return calculadoraService.multiplicar(a, b);
	}

//	@Override
	public float dividir(float a, float b) {
		return calculadoraService.dividir(a, b);
	}

}
