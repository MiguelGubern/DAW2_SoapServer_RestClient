package com.ttdev;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//de parte del servidor, el destino va en src/main/java y el servicio está en "src/main/resources/SimpleService.wsdl"
		WSDLToJava.main( new String[] {
			"-server",
			"-d",
			"src/main/java",
			"src/main/resources/SimpleService.wsdl"
		});
		System.out.println("Hecho!");
	}

}
