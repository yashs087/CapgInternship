package com.skill.capg.bank;
import java.util.Scanner;
public class Transaction {
	static float bal=1000f;
	static Scanner get = new Scanner(System.in);
	static void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    static void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
    static void check_balance() {
    	System.out.print("Your account balance is");
    	System.out.println(bal);
    
    }
    static void exit() {
    	System.out.println("Thanks for using bank");
    }
}
