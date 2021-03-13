package com.skill.capg.lab1;

public class Exercise6 {
	static int calculateDifference(int n) {
		int s1=0;
		int s2=0;
		for(int i=1;i<=n;i++) {
			s1=s1+(i*i);
			s2=s2+i;
		}
		return s1-(s2*s2);
	}
}
