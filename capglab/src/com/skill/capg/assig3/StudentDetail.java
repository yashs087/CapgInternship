package com.skill.capg.assig3;
import java.util.Scanner;
public class StudentDetail {

	int id,a=0;
	String name;
	String group;
	int[] marks=new int[6];
	 int total;
	 
	StudentDetail()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter Group");
		group=sc.next();
		System.out.println("Enter marks");
		for(int i=0;i<6;i++) {
		
		marks[i]=sc.nextInt();
		}
		
		
	}
	 int total()
	  {
		  for(int i=0;i<6;i++)
		  {
			  a+=marks[i];
		  }
		  return a;
	  }
	 int average()
	 {
		 int sum=0;

	       for(int count=0;count<6;count++)
	      sum+=marks[count];
	       return sum;
	 }
	 int highest_marks()
	 {
		 int high=marks[0];

	       for(int count=0;count<6;count++)
	      {
	         if(marks[count]>high)
	        high=marks[count];
	      }
		 return high;
	 }
	 int lowest_marks()
	 {
		 int low=marks[0];

	       for(int count=0;count<6;count++)
	      {
	         if(marks[count]<low)
	        low=marks[count];
	      }
		 return low;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail s1=new StudentDetail();
		System.out.println("total: "+s1.total());
		System.out.println("average: "+s1.average());
		System.out.println("heighest_marks: "+s1.highest_marks());
		System.out.println("lowest_marks: "+s1.lowest_marks());
	}

}