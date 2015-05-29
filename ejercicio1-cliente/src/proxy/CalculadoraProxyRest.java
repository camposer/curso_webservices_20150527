package proxy;

import webservice.CalculadoraRest;
import webservice.request.CalculadoraRequest;
import webservice.response.JsonResponse;

public class CalculadoraProxyRest implements CalculadoraProxy {
	private CalculadoraRest calculadoraRest;

	private Float calcular(Float a, Float b, String operacion) {
		CalculadoraRequest request = new CalculadoraRequest();
		request.setOp1(a);
		request.setOp2(b);
		request.setOperacion(operacion);
		
		JsonResponse response = calculadoraRest.calcular(request);
		
		if (response.getSuccess())
			return new Float(response.getResult().toString());
		else
			throw new RuntimeException((String)response.getResult());
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
		return calcular(a, b, "DIVISION");	
	}

	public void setCalculadoraRest(CalculadoraRest calculadoraRest) {
		this.calculadoraRest = calculadoraRest;
	}
}
