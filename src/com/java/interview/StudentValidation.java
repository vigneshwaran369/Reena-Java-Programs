package com.java.interview;

import java.util.Iterator;

public class StudentValidation {
static int pcount= 0;
static int fcount=0;
static int[] fail;
static int[] pass;
	public static void main(String[] args) {
		
		StudentData[] s =new  StudentData[5];
		
		s[0]  = new StudentData("arun", 45);
		s[1] = new StudentData("kumar", 32);
		s[2] = new StudentData("raj", 90);
		s[3] = new StudentData("manoji", 72);
		s[4] = new StudentData("kishore", 22);
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].getMark()<35) {
				
				System.out.println(s[i].getMark());
			}
			
		}
		 
		
	}
	
	
	
	
	
	
	
}
