package gui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import proxy.CalculadoraProxy;

public class Principal {
	private Scanner scanner;
	private CalculadoraProxy calculadoraProxy;
	
	@SuppressWarnings("resource")
	public Principal() {
		scanner = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		calculadoraProxy = ctx.getBean("calculadoraProxyRest", CalculadoraProxy.class);
	}
	
	public static void main(String[] args) {
		new Principal().iniciar();
	}

	private void iniciar() {
		while (true) {
			System.out.println("1. Sumar"); 
			System.out.println("2. Restar"); 
			System.out.println("3. Multiplicar"); 
			System.out.println("4. Dividir"); 
			System.out.println("5. Salir");
			
			String opcion = scanner.nextLine();
			if (opcion.equals("5"))
				break;
			
			System.out.print("a? ");
			Float a = Float.parseFloat(scanner.nextLine());
			System.out.print("b? ");
			Float b = Float.parseFloat(scanner.nextLine());		
			
			if (opcion.equals("1"))
				System.out.println(a + " + " + b + " = " + 
						calculadoraProxy.sumar(a, b));
			else if (opcion.equals("2"))
				System.out.println(a + " - " + b + " = " + 
						calculadoraProxy.restar(a, b));
			else if (opcion.equals("3"))
				System.out.println(a + " * " + b + " = " + 
						calculadoraProxy.multiplicar(a, b));
			else if (opcion.equals("4"))
				System.out.println(a + " / " + b + " = " + 
						calculadoraProxy.dividir(a, b));
		}
	}
}
