
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class accounting {    int balance=2000;
     void deposit()
    {
        float amt;
        System.out.println("Enter the amount to be deposited::");
        Scanner s = new Scanner(System.in);
        amt = s.nextFloat();
        balance += amt;

    }//end of deposit

    void withdraw()
    {
        float amt;
        System.out.println("Enter the amount to be withdrawn::");
        Scanner s = new Scanner(System.in);
        amt = s.nextFloat();
        if((balance-amt)>=500)
        {
            balance -= amt;
        }
        else
            System.out.println("***Insufficient balance***");
    }

    
}

