package com.skill.capg.assig1;

import java.util.Scanner;

public class Quest2 {
	static void bill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Idly (2)");
		System.out.println("Puri (3)");
		System.out.println("Dosa (3.5)");
		System.out.println("Milk (3)");
		System.out.println("Exit");
		System.out.println("Enter your Favorit Dish code :");
		int item=sc.nextInt();
		System.out.println("How many packages you want?");
		int quant=sc.nextInt();
		System.out.print("Please pay the amount: ");
		System.out.println(item*quant);
		System.out.print("-- Thank You Visit Again--");
		
	}
}
