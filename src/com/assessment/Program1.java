package com.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program1 {

	private static void subMethod1() {

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				int n = i * i;
				System.out.println(n);
			}
		}

	}

	private static void subMethod2() {
			String s = "davidwilley@sample.com";
			int in = s.indexOf("@");
	//	 String	replace = s.substring(0, 2) + 
	//		String r1 = s.replaceAll(s.substring(2, in-9), "X") +s.substring(11);
			
		//	System.out.println(replace);
			
	}

	public static void method3() {
		String s = new String("davidwilley@sample.com");
		String[] allWords = s.split("@");
		String replace=allWords[0].substring(2);
		System.out.println(allWords[0]);
		int length1 = replace.length();
		for (int j = 0; j < length1 - 2; j++) {
			char charAt = replace.charAt(j);
			replace = replace.replace(charAt, 'x');
		}
		System.out.println(s.substring(0,2)+replace+'@'+allWords[1]);
	}

	private  static void subMethod4() {
		int a[] = {1, 4, 6,7,2,3,4,5,6,7,7,1,1,2,2};
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < l.size(); i++) {
			
				if (m.containsKey(l.get(i))) {
					m.put(l.get(i), m.get(l.get(i)) + 1);
				} else {
					m.put(l.get(i), 1);
				}
			
		}
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		method3();
		subMethod4();
	}
	
}
