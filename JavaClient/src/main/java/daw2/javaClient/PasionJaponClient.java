package daw2.javaClient;

import com.ttdev.post.*;
import com.ttdev.token.*;
import com.ttdev.user.*;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import java.util.*;

public class PasionJaponClient {
	
	public static void main (String [] args) {
		// Rest Client Preparation
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("--- Pasión Por Japón Title Changer ---");
		System.out.println("--------------------------------------");
		System.out.println();
		boolean existPath = false;
		String toModifyTile = "";
		do {
			System.out.print("Introduzca un ID de artículo (Post) que quiera modificar: ");
			int postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
				client = WebClient.create("http://172.20.10.3/blog/rest");
		    	client.accept("application/xml");
		    	client.path("node/" + postId);
				Post post = client.get(Post.class);
				toModifyTile = post.getTitle();
				existPath = true;
			} catch (javax.ws.rs.NotFoundException e) {
				System.out.println("Introduce un ID de artículo existente.");
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
		client.path("node/83");
		
		// Soap Server Call - Converting title string
		SimpleService_P1_Client soapClient = new SimpleService_P1_Client();
		String modifiedTitle = soapClient.modifyDrupalTitle(toModifyTile);
		
		// Prepare Put - Building body
		form = new Form();
		form.set("title", modifiedTitle);
		
		// Prepare Put - Building headers
		client.header("cookie", usuario.getSessionName() + "=" + usuario.getSessid());
		client.replaceHeader("X-CSRF-Token", usuario.getToken());
		
		// Put - Send petition
		String resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form, String.class);
		
		// Log Out
		client.back(true);
		client.path("user/logout");
		client.post(null, String.class);
		
		System.out.println("¡Título Cambiado!");
		System.out.println("Original = " + toModifyTile);
		System.out.println("Modificado = " + modifiedTitle);
		System.out.println("----------------");
		System.out.println("Práctica 3 DAW2:");
		System.out.println("- Alejandro López Santos");
		System.out.println("- Santiago Miguel Gubern González");
	}

}
