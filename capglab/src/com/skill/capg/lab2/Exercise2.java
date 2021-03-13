package com.skill.capg.lab2;
import java.util.Arrays;
public class Exercise2 {
	static String sortString(String[] arr)
	{
		  Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		int n=arr.length;
		
		if(n%2==0)
		{
			
			for(int i=0;i<n/2;i++)
			{
				arr[i]=arr[i].toUpperCase();
				
			}
			for(int i=n/2;i<n;i++)
			{
				 arr[i]=arr[i].toLowerCase();
			}
			
		}
		else {
			for(int i=0;i<(n/2)+1;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++)
			{
				arr[i]= arr[i].toLowerCase();
			}
			
		}
		
		String ab=Arrays.toString(arr);
		
	return ab;	
	}

}
	

