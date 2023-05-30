package com.tnsif.daytwo;

public class ForEachDemo {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 }; // integer array

		for (int i : a) {
			System.out.println(i);
		}

		char ch[] = { 'j', 'a', 'v', 'a' };

		for (char c : ch) {
			System.out.println(c);
		}

		String s1[] = { "java","programming" };

		for (String s : s1) {
			System.out.println(s);
		}

	}

}
