package com.java.interview;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringfunctions6 {
	
	
	private static void subMethod() {
		String s = "HoMePaGe";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				char c1 = Character.toUpperCase(c);
				System.out.print(c1);
			}
		}
		System.out.println();
		System.out.println("***********");
	}

	
	
	
	
	
	
	
	
	
	
	private static void submethod1() {

		String s = "mobile";
		String s1 = "";
		// omdgnc
		char[] ch = s.toCharArray();
		List<Character> l = new LinkedList<Character>();
		for (char c = 'a'; c <= 'z'; c++) {
			l.add(c);
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = s.indexOf(c);
			if (index % 2 == 0) {
				int listIndex = l.indexOf(c);
				Character newch = l.get(listIndex + 2);
				s1 = s1 + newch;
			} else if (index % 2 == 1) {
				int listIndex = l.indexOf(c);
				Character newch1 = l.get(listIndex - 2);
				s1 = s1 + newch1;
			}
		}
		System.out.println(l);
		System.out.println(s1);
	}

	private static void subMethod2() {
		String s = "Today is Saturday";
		String s1 ="";
		int length = s.length();
			
			
			for (int j = length-1; j>=0;j--) {
				
			}
			
		
		System.out.println(s1);
	}

	public static void main(String[] args) {
		subMethod();
		submethod1();
//		subMethod2();
	}
}
