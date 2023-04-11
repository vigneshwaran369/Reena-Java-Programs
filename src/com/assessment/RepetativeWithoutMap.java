package com.assessment;

public class RepetativeWithoutMap {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,2};
		
		int r[] = new int[a.length];
		int visit =-1;
		
		for (int i = 0; i < a.length; i++) {
			int count =1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				r[j]= visit;
				}
			}
			if(r[i]!=visit) {
				r[i] =count;
			}
		}
		for (int i = 0; i < r.length; i++) {
			if(r[i]!=visit) {
			System.out.println(a[i]+" || "+r[i]);
			}
		}
	}
}
