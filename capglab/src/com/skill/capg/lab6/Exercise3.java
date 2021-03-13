package com.skill.capg.lab6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("how many integers you want to insert");
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for (int i=0;i<n;i++) {
			int a= arr[i];
			map.put(a, a*a);
		}
		for (Entry<Integer, Integer> entry : map.entrySet())  {
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 	}
}
}
