package com.skill.capg.lab1;
import java.util.Scanner;
public class Exercise3 {


	    static void nonr() {
	        int n1=0,n2=1,n3,i,count=10;
	         System.out.print(n1+" "+n2);

	         for(i=2;i<count;++i)
	         {
	          n3=n1+n2;
	          System.out.print(" "+n3);
	          n1=n2;
	          n2=n3;
	         }
	    }


	    public static int rec(int n){
	        if(n == 0){
	            return 0;
	        }
	        if(n == 1 || n == 2){
	                return 1;
	            }
	        return rec(n-2) + rec(n-1);
	        }
	        static void vec() {
	        int maxNumber = 10;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	        for(int i = 0; i < maxNumber; i++){
	                System.out.print(rec(i) +" ");
	            }
	        }



	    public static void main(String args[])
	    {


	        int choice=0;
	        System.out.println("Enter a choice:1. non recursive        2. recursive");
	        Scanner s = new Scanner(System.in);
	        choice = Integer.parseInt(s.nextLine());


	     if(choice==1) {
	       nonr();
	     }

	     else {

	         vec();


	     }
	}


	}


