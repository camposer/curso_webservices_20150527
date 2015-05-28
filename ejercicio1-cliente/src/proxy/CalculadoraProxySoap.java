package proxy;

import org.springframework.beans.factory.annotation.Autowired;

import webservice.calculadora.CalculadoraSoap;

public class CalculadoraProxySoap implements CalculadoraProxy {
	@Autowired
	private CalculadoraSoap calculadoraSoap;
	
	public Float sumar(Float a, Float b) {
		return calculadoraSoap.sum(a, b);
	}

	public Float restar(Float a, Float b) {
		return calculadoraSoap.substract(a, b);
	}

	public Float multiplicar(Float a, Float b) {
		return calculadoraSoap.multiply(a, b);
	}

	public Float dividir(Float a, Float b) {
		return calculadoraSoap.divide(a, b);
	}

	public void setCalculadoraSoap(CalculadoraSoap calculadoraSoap) {
		this.calculadoraSoap = calculadoraSoap;
	}
}
