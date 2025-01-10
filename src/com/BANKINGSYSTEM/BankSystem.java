package com.BANKINGSYSTEM;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        double currentBalance = 2000.0;
        double depositeMoney;
        double withdrawMoney;
        Scanner sc = new Scanner(System.in);
        int input;
        do {

            System.out.println("-----------Welcome to Banking Management System-----------");
            System.out.println("1.Check Balance:-");
            System.out.println("2.Deposite Money:-");
            System.out.println("3.Withdraw Money:- ");
            System.out.println("4.Exit:-");

            System.out.print("Choose option:-");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("The Current Money:-" + currentBalance);
                    break;
                case 2:
                    System.out.print("Enter the deposite money:-");
                    depositeMoney = sc.nextDouble();
                    if (depositeMoney > 0) {
                        currentBalance = currentBalance + depositeMoney;
                        System.out.println("The Deposite Money:-" + depositeMoney);
                        System.out.println("The Updated Amount:-" + currentBalance);
                    } else {
                        System.out.println("please enter valid amount:-");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Withdrawal Amount:-");
                    withdrawMoney = sc.nextDouble();
                    if (withdrawMoney > 0 && withdrawMoney <= currentBalance) {
                        currentBalance = currentBalance - withdrawMoney;
                        System.out.println("Withdrawal amount:-" + withdrawMoney);
                        System.out.println("Updated Amount:-" + currentBalance);
                    } else if (withdrawMoney > currentBalance) {
                        System.out.println("Insuffecient Funds..");
                    } else {
                        System.out.println("Please enter vaild amount..");
                    }
                    break;
                case 4:
                    System.out.println("Bye Bye..../have a good day Sir/Mam ");
                    break;
                default:
                    System.out.println("Enter Valid Option:-");
            }
        } while (input != 4);

    }
}
