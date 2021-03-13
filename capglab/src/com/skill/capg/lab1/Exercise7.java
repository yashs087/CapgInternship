package com.skill.capg.lab1;

public class Exercise7 {
	static boolean checkNumber(int num) {
		 int currentDigit = num % 10;
	       num = num/10;
	       boolean flag=false;

	       while(num>0){

	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }

	       if(flag){
	           return false;
	       }else{
	           return true;
	       }
	}
}
