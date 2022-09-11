package org.practice;

public class Question12 {
	
	public static void main(String[] args) {
		
		String str="Welcome";
		char[] c = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) 
        {
            // check if char[i] is vowel
            if (c[i] == 'a' || c[i] == 'e'|| c[i] == 'i'|| c[i] == 'o'|| c[i] == 'u') {
            	
            	c[i] = '@';
                
            }
            
        }
		
		for(int i =0; i<c.length; i++) {
			System.out.println(c[i]);
		}
            
	}

}
