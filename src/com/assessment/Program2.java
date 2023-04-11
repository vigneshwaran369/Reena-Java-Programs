package com.assessment;

import java.util.Arrays;

public class Program2 {
public static void main(String[] args) {
	String s = "coderbyte";
	char[] ch = s.toCharArray();
	Arrays.sort(ch);
	for(char c : ch) {
		System.out.print(c);
	}
}
}
