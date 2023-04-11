package com.assessment;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program4 {
	private void subMethod() {
		int a[] = { 1, 2, 2, 3, 4, 4, 6, 4, 7, 7 };
		for (int i = 0; i < a.length; i++) {
			int n = 0;
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				n = i + 1;
				if (a[i] == a[j]) {
					count++;
					if (j == n) {
						System.out.println(a[i] + "=" + count);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 4, 6, 4, 7, 7 };
		Map<Integer, Integer> m = new LinkedHashMap<>();
		for (int i : a) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}
//		System.out.println(m);
		Set<Integer> keySet = m.keySet();
		for (Integer in : keySet) {
			int c =0;
			if(m.get(in) == 2) {
				for (int i = 0; i < a.length; i++) {
					
						if(a[i] == in) {
//							System.out.println(a[i]+"="+a[j]);
							
							
					}
					
				}
			}
			
			
		}
	}

}
