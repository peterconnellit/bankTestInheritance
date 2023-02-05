/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banktest;

/**
 *
 * @author peter
 */
public class BankTest {

    public static void main(String[] args) {
        Account account1 = new Account("Bob Jones", 123456, 1000.00);
        displayAccountDetails(account1);
        modifyAccount(account1, 500.00);
        displayAccountDetails(account1);

        JointAccount jointAccount1 = new JointAccount("Fred Jones", "Susan Jones", 654321, 2000.00);
        displayAccountDetails(jointAccount1);
        modifyAccount(jointAccount1, 1000.00);
        displayAccountDetails(jointAccount1);

        StudentAccount studentAccount1 = new StudentAccount("John Smith", 111111, 500.00, "UCEN Manchester");
        displayAccountDetails(studentAccount1);
        modifyAccount(studentAccount1, 2000.00);
        displayAccountDetails(studentAccount1);
    }

    public static void displayAccountDetails(Account account) {
        System.out.println("Account name: " + account.getName());
        System.out.println("Account number: " + account.getAccountNo());
        System.out.println("Account balance: $" + account.getBalance());
        if (account instanceof JointAccount) {
            JointAccount jointAccount = (JointAccount) account;
            System.out.println("Joint account name 2: " + jointAccount.getName2());
        }
        if (account instanceof StudentAccount) {
            StudentAccount studentAccount = (StudentAccount) account;
            System.out.println("Place of study: " + studentAccount.getPlaceOfStudy());
        }
        System.out.println();
    }

    public static void modifyAccount(Account account, double change) {
        account.modify(change);
        System.out.println("Modified balance: $" + account.getBalance());
        System.out.println();
    }
}
