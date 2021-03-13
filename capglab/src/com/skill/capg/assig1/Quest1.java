package com.skill.capg.assig1;
import java.util.Scanner;
public class Quest1 {
	static void salaryDistribution() {
	Scanner sc = new Scanner(System.in);
	int salary=sc.nextInt();
	System.out.print("Expenditure : ");
	System.out.println(salary*25/100);
	System.out.print("Savings : ");
	System.out.println(salary*35/100);
	System.out.print("Sports : ");
	System.out.println(salary*10/100);
	System.out.print("charity : ");
	System.out.println(salary*5/100);
	System.out.print("Future Savings : ");
	System.out.println(salary*25/100);
	}
}
