package com.skill.capg.lab1;

public class Exercise1 {
	
	static void sumOfCubes(int num,int n){
		int s=0;
		int x=0;
		for(int i =0; i<n;i++) {
			x=num%10;
			s=s+(x*x*x);
			num=num/10;
		
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		sumOfCubes(30,2);
		}	
	}


