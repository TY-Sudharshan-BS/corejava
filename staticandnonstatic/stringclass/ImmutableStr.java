package com.tyss.strings.stringclass;

public class ImmutableStr {
	public static void main(String[] args) {
		String s = "TestYantra";
		String s1 = "TestYantra";
		String s2 = "TestYantra";
		
		
		
		System.out.println(s.equals(s1));
		
		s2 = "ELF";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
	}
	
}
