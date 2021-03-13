package com.skill.capg.assig6;
import java.util.*;
public class SortScores {
	

	void sort(){
		ArrayList<Integer> scores =new ArrayList<Integer>();
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			scores.add(scan.nextInt());
		}
		
		Collections.sort(scores); 
		for(Integer score:scores) System.out.println(score);
	}
	
	public static void main(String[] args) {
		
		SortScores s1 =new SortScores();
		s1.sort();
		
	}
		
}
