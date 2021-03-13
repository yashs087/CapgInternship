package com.skill.capg.lab3;
import java.util.Scanner;
public class Exercise2 {

	static String s1,s2,s3;
	
	static String getImage()
	{
		StringBuilder str=new StringBuilder();
		StringBuilder str2=new StringBuilder();
		str.append(s1);
		str2=str.reverse();
		s3=s1+"|"+str2.toString();
		return s3;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		 s1=input.next();
		 System.out.println(getImage());
	}
}
