package org.practice;

public class Question10 {
	
	public static void main(String[] args) {
		
		String str ="Welcome";
		int countv = 0;
        int countc = 0;
 
        for (int i = 0; i < str.length(); i++) 
        {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                countv++;
            }
            else {
            	countc++;
            }
        }
        
        System.out.println("Number of vowels are: "+countv);
        
        System.out.println("Number of consonants are: "+countc);
	}

}
