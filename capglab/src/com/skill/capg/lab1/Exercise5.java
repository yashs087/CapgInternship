package com.skill.capg.lab1;

import java.util.Scanner;
public class Exercise5 {
	static int calculateSum(int n) {
		int s=0;
		for(int i =1;i<=n;i++) {
			if (i%3==0 || i%5==0) {
				s=s+i;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
	}
}
