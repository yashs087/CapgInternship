package com.skill.capg.lab5;

import java.util.Scanner;
class AgeException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String toString()
    {
        return "age of a person should be above 15";
    }
}
public class Exercise1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age>15)
        {
            throw new AgeException();
        }
        else
            System.out.println("Age of the person is "+age);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    }

}