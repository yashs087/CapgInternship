package com.skill.capg.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise8 {

	static boolean isAlphabetic(String s) {
		int n = s.length();
		char c[] = new char[n];
		for(int i = 0; i< n; i++)  {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		
		for(int i = 0; i < n; i++)
			if(c[i] != s.charAt(i))
				return false;
		
		return true;
	}
	
	public static void main(String []ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		
		if(isAlphabetic(s))
			System.out.println(true);
		else
			System.out.println(false);
		sc.close();
	}
}