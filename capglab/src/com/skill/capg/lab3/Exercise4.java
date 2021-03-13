package com.skill.capg.lab3;

public class Exercise4 {
	static void modifyNumber(int num){
		String number=Integer.toString(num);
		StringBuffer s=new StringBuffer();
		for (int i=0; i<number.length();i++) {
			int n1=Character.getNumericValue(number.charAt(i));
			//System.out.println(n1);
			if (i<number.length()-1) {
			int n2=Character.getNumericValue(number.charAt(i+1));
			n1= n1-n2;
			if (n1<0) {
				n1=n1*-1;
			}
			}
			//System.out.println(n1);
			s.append(n1);
			
			
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		modifyNumber(45862);
		
	}
}
