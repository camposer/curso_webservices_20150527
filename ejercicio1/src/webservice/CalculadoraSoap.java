package webservice;

import javax.jws.WebService;

@WebService
public interface CalculadoraSoap {
	float sumar(float a, float b);
	float restar(float a, float b);
	float multiplicar(float a, float b);
	float dividir(float a, float b);
}
