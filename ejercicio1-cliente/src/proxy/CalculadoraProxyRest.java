package proxy;

import webservice.CalculadoraRest;
import webservice.request.CalculadoraRequest;
import webservice.response.JsonResponse;

public class CalculadoraProxyRest implements CalculadoraProxy {
	private CalculadoraRest calculadoraRest;

	private Float calcular(Float a, Float b, String operacion) {
		CalculadoraRequest request = new CalculadoraRequest();
		request.setOp1(a);
		request.setOp1(b);
		request.setOperacion(operacion);
		
		JsonResponse response = calculadoraRest.calcular(request);
		
		if (response.getSuccess())
			return (Float)response.getResult();
		else
			throw new RuntimeException(response.getResult().toString());
	}
	
	public Float sumar(Float a, Float b) {
		return calcular(a, b, "SUMA");
	}

	public Float restar(Float a, Float b) {
		return calcular(a, b, "RESTA");	
	}

	public Float multiplicar(Float a, Float b) {
		return calcular(a, b, "MULTIPLICACION");	
	}

	public Float dividir(Float a, Float b) {
		return calcular(a, b, "DIVISIOn");	
	}

	public void setCalculadoraRest(CalculadoraRest calculadoraRest) {
		this.calculadoraRest = calculadoraRest;
	}
}
