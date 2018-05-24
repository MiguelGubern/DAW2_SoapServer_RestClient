package daw2.javaClient;

import com.ttdev.post.*;
import com.ttdev.token.*;
import com.ttdev.user.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import java.util.*;

public class PasionJaponClient {
	
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("------- Pasión Por Japón CRUD -------");
		System.out.println("--------------------------------------");
		System.out.println();
		boolean exit;
		boolean goodSelection = false;
		do {
			System.out.println("Introduzca el comando para realizar una operación: ");
			System.out.println("(1) para create");
			System.out.println("(2) para read");
			System.out.println("(3) para update (Title Changer)");
			System.out.println("(4) para delete");
			System.out.println("(5) para exit");
			int selection = keyboard.nextInt();
			System.out.println();
			switch (selection) {
			case 1:
				
				break;
			case 2:
				readPost();
				break;
			case 3:
				titleChanger();
				break;
			case 4:
				deletePost();
				break;
			case 5:
				System.out.println();
				System.out.println("Práctica 3 DAW2 - Grupo 7:");
				System.out.println("- Alejandro López Santos");
				System.out.println("- Santiago Miguel Gubern González");
				return;
			default:
				System.out.println("Comando incorrecto");
				break;
			}
		} while (true);
	}
	
	public static void readPost() {
		// Rest Client Preparation
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("	--- READ Post ---");
		System.out.println("	-------------------");
		System.out.println();
		boolean existPath = false;
		int postId;
		Post post = null;
		do {
			System.out.print("	Introduzca un ID de un contenido tipo Post: ");
			postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
				client = WebClient.create("http://192.168.1.37/blog/rest/");
		    	client.accept("application/xml");
		    	client.path("node/" + postId);
				post = client.get(Post.class);
				if (post.getType().equalsIgnoreCase("post")) {
					existPath = true;
				} else {
					System.out.println("	Introduce un ID de un contenido tipo Post:");
					System.out.println();
					existPath = false;
				}
			} catch (javax.ws.rs.NotFoundException e) {
				System.out.println("	Introduce un ID de un contenido tipo Post existente.");
				System.out.println();
				existPath = false;
			}
		} while (!existPath);
		
		System.out.println("	Título: " + post.getTitle());
		System.out.println("	Tipo: " + post.getType());
		System.out.println("	Cuerpo: " + post.getBody().getUnd().getItem().getValue());
		System.out.println();
	}
	
	public static void deletePost() {
		// Rest Client Preparation
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("	--- DELETE Post ---");
		System.out.println("	-------------------");
		System.out.println();
		boolean existPath = false;
		int postId;
		Post post;
		do {
			System.out.print("	Introduzca un ID de un contenido tipo Post: ");
			postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
				client = WebClient.create("http://192.168.1.37/blog/rest/");
		    	client.accept("application/xml");
		    	client.path("node/" + postId);
				post = client.get(Post.class);
				if (post.getType().equalsIgnoreCase("post")) {
					existPath = true;
					System.out.println("	¿Está seguro que desea eliminar '" + post.getTitle() + "'? (1/0)");
					int confirm =keyboard.nextInt();
					if(confirm == 0) {
						return;
					}
				} else {
					System.out.println("	Introduce un ID de un contenido tipo Post:");
					System.out.println();
					existPath = false;
				}
			} catch (javax.ws.rs.NotFoundException e) {
				System.out.println("	Introduce un ID de un contenido tipo Post existente.");
				System.out.println();
				existPath = false;
			}
		} while (!existPath);
		
		// Get Token
		client.back(true);
		client.path("user/token");
		Token token = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null, Token.class);

		// Log In
		client.back(true);
		client.path("user/login");
		client.header("x-CSRF-Token", token.getToken());
		
		Form form = new Form();
		form.set("username", "test-editor");
		form.set("password", "test-editor");
		
		Usuario usuario = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, Usuario.class);

		// Prepare Put - Drupal Post Content Type
		client.back(true);
		client.path("node/"+postId);
		
		// Prepare Put - Building headers
		client.header("cookie", usuario.getSessionName() + "=" + usuario.getSessid());
		client.replaceHeader("X-CSRF-Token", usuario.getToken());
		
		// Put - Send petition
		Response resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).delete();

		// Log Out
		client.back(true);
		client.path("user/logout");
		client.post(null, String.class);
		
		System.out.println();
		System.out.println("	" + resp.toString());
		System.out.println();
	}
	
	
	public static void titleChanger() {
		// Rest Client Preparation
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("	--- Title Changer ---");
		System.out.println("	---------------------");
		System.out.println();
		boolean existPath = false;
		String toModifyTile = "";
		int postId;
		do {
			System.out.print("	Introduzca un ID de un contenido tipo Post que quiera modificar: ");
			postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
				client = WebClient.create("http://192.168.1.37/blog/rest/");
		    	client.accept("application/xml");
		    	client.path("node/" + postId);
				Post post = client.get(Post.class);
				if (post.getType().equalsIgnoreCase("post")) {
					toModifyTile = post.getTitle();
					existPath = true;
				} else {
					System.out.println("	Introduce un ID de un contenido tipo Post.");
					System.out.println();
					existPath = false;
				}
			} catch (javax.ws.rs.NotFoundException e) {
				System.out.println("	Introduce un ID de un contenido tipo Post existente.");
				System.out.println();
				existPath = false;
			}
		} while (!existPath);
		
		// Soap Server Call - Converting title string
		
		// Async Petition
		SoapAsyncRequest soapCall = new SoapAsyncRequest(toModifyTile);
		soapCall.start();
		
		// Get Token
		client.back(true);
		client.path("user/token");
		Token token = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null, Token.class);

		// Log In
		client.back(true);
		client.path("user/login");
		client.header("x-CSRF-Token", token.getToken());
		
		Form form = new Form();
		form.set("username", "test-editor");
		form.set("password", "test-editor");
		
		Usuario usuario = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, Usuario.class);

		// Prepare Put - Drupal Post Content Type
		client.back(true);
		client.path("node/"+postId);
		
		// Prepare Put - Building body
		form = new Form();
		try {
			soapCall.join(); // wait for async request if needed
		} catch (InterruptedException e) {}
		String soapResponse = soapCall.getModifiedTitle();
		form.set("title", soapResponse);
		
		// Prepare Put - Building headers
		client.header("cookie", usuario.getSessionName() + "=" + usuario.getSessid());
		client.replaceHeader("X-CSRF-Token", usuario.getToken());
		
		// Put - Send petition
		String resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form, String.class);

		// Log Out
		client.back(true);
		client.path("user/logout");
		client.post(null, String.class);
		
		System.out.println();
		System.out.println("	¡Título Cambiado!");
		System.out.println("	Original = " + toModifyTile);
		System.out.println("	Modificado = " + soapResponse);
		System.out.println();
	}

}
