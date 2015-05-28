package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;

import service.CalculadoraService;

@WebService(
		targetNamespace  = "calculadora.webservice",
		serviceName = "CalculadoraSoap")
@SOAPBinding(
		style = SOAPBinding.Style.RPC,
		use = SOAPBinding.Use.LITERAL)
public class CalculadoraSoap  {
	@Autowired
	private CalculadoraService calculadoraService;

	@WebMethod(operationName = "sum")
	@RequestWrapper(localName = "sumRequest")
	public float sumar(
			@WebParam(name = "a") float a, 
			@WebParam(name = "b") float b) {
		return calculadoraService.sumar(a, b);
	}

	@WebMethod(exclude = true)
	public float modulo(float a, float b) {
		return a % b;
	}
	
	@WebMethod(operationName = "substract")
	@RequestWrapper(localName = "substractRequest")
	public float restar(
			@WebParam(name = "a") float a, 
			@WebParam(name = "b") float b) {
		return calculadoraService.restar(a, b);
	}

	@WebMethod(operationName = "multiply")
	@RequestWrapper(localName = "multiplyRequest")
	public float multiplicar(
			@WebParam(name = "a") float a, 
			@WebParam(name = "b") float b) {
		return calculadoraService.multiplicar(a, b);
	}

	@WebMethod(operationName = "divide")
	@RequestWrapper(localName = "divideRequest")
	public float dividir(
			@WebParam(name = "a") float a, 
			@WebParam(name = "b") float b) {
		
		return calculadoraService.dividir(a, b);
	}

}
