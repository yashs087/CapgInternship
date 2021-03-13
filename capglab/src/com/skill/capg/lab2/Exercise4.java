package com.skill.capg.lab2;

public class Exercise4 {
	static int[] modifyArray(int[] arr) {
	int temp=0;
	for (int i=0;i<arr.length-1;i++) {
		for(int j =0;j<arr.length-1;j++) {
			temp=0;
			if (arr[j]<arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	int n=1;
	for (int i=0;i<arr.length-1;i++) {
		if (arr[i]!=arr[i+1]){
			n=n+1;
		}
	}
	//System.out.println(n);
	int[] no_dup=new int[n];
	int count=1;
	no_dup[0]=arr[0];
	
	for (int i=1;i<arr.length;i++) {
		//System.out.println(arr[i]);
		if (arr[i]!=arr[i-1]){
			no_dup[count++]=arr[i];
			//System.out.println(arr[i]);	
		}
		
		//System.out.println(arr[i]);
	}
	
	return no_dup;
	}
}
