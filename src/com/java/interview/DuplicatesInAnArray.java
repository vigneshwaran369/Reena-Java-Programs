package com.java.interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInAnArray {

	private static void subMethod() {
		int a[] = {1,2,3,4,5,3,2,};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]== a[j]) {
					System.out.println("The Duplicate number :"+a[j]);
				}
			}
		}
	}
	private static void subMethod1() {
		Integer a[] = {1,2,3,4,5,3,2,};
		
		List<Integer> l = Arrays.asList(a);
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		subMethod();
		subMethod1();
	}
	
}
