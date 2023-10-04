package com.me.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface = "com.me.ws.AnagramService")
public class Anagram{

public boolean anagramCheck(String a, String b){
	
	int n1 = a.length();
	int n2 = b.length();
	char str1[] = a.toCharArray();
	char str2[] = b.toCharArray();
	
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	if(n1 != n2) return false;
	for(int i = 0; i < n1; i++){
		if(str1[i] != str2[i]) return false;
	}
	return true;
}
}