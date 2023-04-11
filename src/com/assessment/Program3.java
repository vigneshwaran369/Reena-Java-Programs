package com.assessment;

public class Program3 {

	private static void sub() {
		String[] s = {"hellocat","apple,bat,cat,goodbye,hello,yellow,why"};
		String[] split = s[1].split(",");
		for (String string : split) {
			boolean contains = s[0].contains(string);
			if(contains) {
				System.out.print(string+",");
			}
		}
		
	}
	public static void main(String[] args) {
		sub();
	}
}
