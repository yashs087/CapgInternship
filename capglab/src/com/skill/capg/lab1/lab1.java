package com.skill.capg.lab1;
import java.util.Scanner;
public class lab1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean sum;
		sum=Exercise7.checkNumber(n);
		System.out.println(sum);
	}
}
