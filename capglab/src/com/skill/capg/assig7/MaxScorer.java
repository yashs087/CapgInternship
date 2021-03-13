package com.skill.capg.assig7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MaxScorer {

	public static void main(String[] args) {
		
		MaxScorer ms1=new MaxScorer();
		ms1.findMax();
		
	}

	private  void findMax() {
		long maxMap=0;
		// TODO Auto-generated method stub
		String playerName;
		long runs;
		System.out.println("Enter the no Player");
		Scanner sc=new Scanner(System.in);
		int noOfPlayer=sc.nextInt();
		HashMap< String,Long> hm=new HashMap<String,Long>();
		for(int i=1;i<=noOfPlayer;i++)
		{
			System.out.println("Enter the detail of player "+i);
			System.out.println("Enter name");
			playerName=sc.next();
			System.out.println("Enter runs");
			runs=sc.nextLong();
			
			hm.put(playerName,runs);
		}
		
//				Set st=hm.keySet();
//		Iterator itr=st.iterator();
//		while(itr.hasNext())
//		{
//			Object key=itr.next();
//			Object value=hm.get(key);
//			
//			
//		}
			
		    System.out.println("max value "+Collections.max(hm.values()));
		
	}

}