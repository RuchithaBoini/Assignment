package com.src;

public class VowelCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowelcount=0, conscount=0;
		String s= "ruchitha";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowelcount++;
			}
			else if (s.charAt(i)>='a' &&s.charAt(i)<='z') {
				conscount++;
			}
		}
		System.out.println("number of vowels:"+vowelcount);
		System.out.println("number of consonants:"+conscount);

	}

}
