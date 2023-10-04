package com.me.ws;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class AnagramClient {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1:8000/myself?wsdl");
		
		QName qname = new QName("http://ws.me.com/","AnagramService");
		
		Service service = Service.create(url, qname);
		
		AnagramService endPoint = service.getPort(AnagramService.class);
		
		Scanner scInput = new Scanner(System.in);
		
		String a,b ;
		boolean result;
		a = scInput.nextLine();
		b = scInput.nextLine();
		result = endPoint.anagramCheck(a, b);
		System.out.println("Is Strings Are Anagram To Each Other : " + result);
		scInput.close();
	}
}