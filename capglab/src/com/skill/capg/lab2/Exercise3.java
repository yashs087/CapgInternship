package com.skill.capg.lab2;

public class Exercise3 {
	static int[] getSorted(int[] arr) {
		int temp=0;
		for (int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			
			
			int r;
			while(arr[i]!=0) {
			r=arr[i]%10;
			temp=temp*10+r;
			arr[i]=arr[i]/10;
			
			}
			arr[i]=temp;
			temp=0;
			//System.out.println(arr[i]);
		}
		for (int i=0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-1;j++) {
				temp=0;
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
