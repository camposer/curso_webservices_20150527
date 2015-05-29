package gui;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.activation.DataHandler;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.Person;
import webservice.PersonaSoap;

public class Principal {
	private PersonaSoap personaSoap;
	private Scanner scanner;

	public Principal() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		personaSoap = ctx.getBean(PersonaSoap.class);
		scanner = new Scanner(System.in);
	}

	public void iniciar() throws Exception {
		while (true) {
			System.out.println("1. Agregar");
			System.out.println("2. Listar");
			String opcion = scanner.nextLine();
			
			if (opcion.equals("1"))
				agregar();
			else if (opcion.equals("2"))
				listar();
			else
				break;
		}


	}

	private void listar() throws Exception {
		for (Person p : personaSoap.findPersons()) { 
			System.out.println(p.getName() + " " + p.getLastName() 
					+ " " + p.getBirthDate());
			
			InputStream is = (p.getPicture() != null) ?
					p.getPicture().getInputStream() : null;
			
			
			String salida = "img/duke-new-" + p.getId() + ".png";
			Files.copy(is, new File(salida).toPath(), StandardCopyOption.REPLACE_EXISTING);
			
		}
	}

	private void agregar() throws Exception {
		System.out.print("Nombre? ");
		String nombre = scanner.nextLine();
		System.out.print("Apellido? ");
		String apellido = scanner.nextLine();
		System.out.print("Fecha de Nacimiento? ");
		Date fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(scanner
				.nextLine());
		System.out.print("Foto (ruta)? ");
		String rutaFoto = scanner.nextLine();
		DataHandler picture = new DataHandler(new URL(rutaFoto));
		
		Person person = new Person();
		person.setName(nombre);
		person.setLastName(apellido);
		person.setPicture(picture);

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(fechaNacimiento);
		XMLGregorianCalendar xmlFechaNacimiento = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(c);
		person.setBirthDate(xmlFechaNacimiento);
		
		personaSoap.addPerson(person);
	}

	public static void main(String[] args) throws Exception {
		new Principal().iniciar();
	}
}
