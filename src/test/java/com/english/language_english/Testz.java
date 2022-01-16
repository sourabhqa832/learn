package com.english.language_english;

public class Testz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sourabh SUtkohoade";
		
		String str1="ifhsef";
		
		char[] ar = str.toCharArray();
		
		char abc ='a';
		
		int len = ar.length;
		
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(ar[i]==ar[j]) {
					
					System.out.println(ar[i]);
				}
			} 
		}

	}

}
