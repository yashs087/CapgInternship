package com.skill.capg.assig6;

import java.util.ArrayList;
import java.util.Scanner;
public class SumAndAverage {

	void calculateSumAndAverage()
	{
		Scanner sc=new Scanner(System.in);
		int noOfMaches=sc.nextInt();
		System.out.println("Enter no of runs");
		int[] noOfRuns = new int[noOfMaches];  
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<noOfMaches;i++)
		a1.add(sc.nextInt());
		int sum=0;
		for (int i : a1) {
			 sum +=i;
		}
		double average=sum/noOfMaches;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
	public static void main(String[] args) {
		System.out.println("Enter No of matches");
		SumAndAverage s1=new SumAndAverage();
		s1.calculateSumAndAverage();
	}

}