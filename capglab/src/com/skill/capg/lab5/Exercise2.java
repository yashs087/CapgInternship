package com.skill.capg.lab5;
import java.util.Scanner;
class NameException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String toString()
    {
        return "First name and last name can't be null";
    }
}
public class Exercise2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the Full Name");
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("\n");
		String str=scanner.next();
		String[] name = str.split(" ");
        try{
            if(name.length<2)
        {
            throw new NameException();
        }
        else
            System.out.print("the name is ");
            for (int i=0;i<name.length;i++) {
            	System.out.print(name[i] +" ");
            }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    }

}