package com.skill.capg.lab1;
import java.util.Scanner;
public class Exercise4 {
	static boolean isPrime(int num){
		for (int i=2;i<num;i++) {
			if (num%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
			for (int i=2;i<=num;i++) {
				if (isPrime(i)==true) {
					System.out.println(i);
				}
			}
	}
}
