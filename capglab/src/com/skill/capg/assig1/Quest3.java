package com.skill.capg.assig1;
import java.util.Scanner;
public class Quest3 {
	static void oneDigit() {
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		int temp;
		while(number>9) {
			temp=number;
			sum=0;
			while(temp>0) {
				sum=sum+(temp%10);
				temp=temp/10;
				
				
			}
			number=sum;
			
		}
		System.out.println(number);
	}
}
