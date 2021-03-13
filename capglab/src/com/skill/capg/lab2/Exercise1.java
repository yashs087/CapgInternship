package com.skill.capg.lab2;

public class Exercise1 {
	static int getSecondSmallest(int[] arr) {
	
	int s1;
	int s2;
	if (arr[0]<arr[1]) {
		s1=arr[0];
		s2=arr[1];
	}
	else {
		s1=arr[1];
		s2=arr[0];
	}
	int n=arr.length;
	for (int i=0;i<n;i++) {
		//System.out.println(arr[i]);
		if (s1>arr[i]) {
			s2=s1;
			s1=arr[i];
			
		}
		else if (s2>arr[i]) {
			s2=arr[i];
		}
		
	}
	return s2;
}
}
