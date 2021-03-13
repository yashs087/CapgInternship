package com.skill.capg.lab1;

public class Exercise8 {
    static boolean checkNumber(int number) {
      if (number % 2 != 0) {
      return false;
    } else {
      for (int i = 0; i <= number; i++) {

        if (Math.pow(2, i) == number) return true;
        if (Math.pow(2,i)>number) return false;
      }
    }
    return false;
    }
}
