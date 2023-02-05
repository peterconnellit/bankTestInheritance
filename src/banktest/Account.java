/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktest;

/**
 *
 * @author peter
 */
public class Account {

    String pr_name = "";
    double pr_balance = 0.00;
    int pr_accountNo = 0;

    public Account(String na, int ac, double ba) //data constructor: sets name, account number and balance
    {
        pr_name = na;
        pr_accountNo = ac;
        pr_balance = ba;
    }

    public double getBalance() //pre:
    //post: returns account balance
    {
        return pr_balance;
    }

    public String getName() //pre:
    //post: returns account name
    {
        return pr_name;
    }

    public int getAccountNo() //pre:
    //post: returns account number
    {
        return pr_accountNo;
    }

    public void modify(double change) //pre: change is double
    //post: adds change to account balance
    {
        pr_balance += change;

    }

}
