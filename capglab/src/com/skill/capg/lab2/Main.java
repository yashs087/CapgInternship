package com.skill.capg.lab2;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		System.out.println("This is main class");
		
		// Taking input array
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    //for (int i=0;i<n;i++) {
	    //	System.out.println(a[i]);
	    //}
	    
	    //for exercise 1
	    //System.out.println(Exercise1.getSecondSmallest(a));
	    
		//For esercise 2
	    //String[] s2= {"f","d","c","a","e","f","g","h","t","j","c","p","l","k"};
		//System.out.println(Exercise2.sortString(s2));
	    
	    //for erercise 3
	    //int[] result;
	    //result= Exercise3.getSorted(a);
	    //for(int i=0;i<result.length;i++) {
	    //System.out.println(result[i]);}
	    
	  //for erercise 4
	    int[] result;
	    result= Exercise4.modifyArray(a);
	    for(int i=0;i<result.length;i++) {
	    System.out.println(result[i]);}
	}	
}
