package progr.miniproject;

import java.util.Scanner;

public class ATMMachine {
	public static void main(String[] args) {
		int balance=20000,Withdraw,deposite,num;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Wellcome to the ATM  Machine");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposite");
			System.out.println("3. Check Balance");
			System.out.println("4.EXIT ");
			num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter the Amount to be Withdraw");
				Withdraw=sc.nextInt();
				if(balance>=Withdraw)
				{
					balance=balance-Withdraw;
					System.out.println("Balance Amount="+balance);
					System.out.println("Please Collect Money");
				}
				else
				{
					System.out.println("You dont have money");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter Amount to Deposite");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("Balance Amount is: "+ balance);
				System.out.println("Money has been Deposited Successfully");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Balance of your Account is: "+ balance);
				System.out.println(" ");
				break;
			case 4:
				System.exit(0);
				System.out.println(" ");
			
			
			}
			
		}
		
		}
		}



