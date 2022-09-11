package org.practice;

public class Question11 {
	
	public static void main(String[] args) {
		
		String str = "Welcome To Java class @123";
		int caps =0, num=0, small=0, spec=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) >='A' && str.charAt(i) <='Z') {
				caps++;
			}
			
			else if(str.charAt(i) >='a' && str.charAt(i) <='z') {
				small++;
			}
			
			else if(str.charAt(i) >='0' && str.charAt(i) <='9') {
				num++;
			}
			
			else {
				spec++;
			}
			
		}
		
		System.out.println("Uppercase letters are: "+caps);
		System.out.println("Lowercase letters are: "+small);
		System.out.println("Numbers are: "+num);
		System.out.println("Special character letters are: "+spec);
	}

}
