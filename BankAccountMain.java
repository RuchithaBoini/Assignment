package project;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int balance=0;
		int withdraw=0;
		int aNumber=0;
		String type = null;
        //aNumber=(int)((Math.random()*9000)+1000);
		newaccount na =new newaccount("na",0,0);
		Scanner s=new Scanner(System.in);
		int choice;
		boolean quit=false;
		do {
			System.out.println("1.Create an account:");
			System.out.println("2.Deposit Money:");
			System.out.println("3.Withdraw Money:");
			System.out.println("4.Check Balance:");
			System.out.println("5.Display Account details:");
			System.out.println("0-Quit ");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			name=s.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter your Name:"+name);
				System.out.println("Enter Account type:"+type);
				type=s.next();
				
				na.insert(name,aNumber,type);
				System.out.println("Your account details:");
				na.display();
				break;
			case 2:
				System.out.println("enter your account number");
				int temp = s.nextInt();
				if(temp==na.accountnumber) {
					System.out.println("Enter the amount you want:");
					balance=s.nextInt();
					na.accountbalance=balance;
					System.out.println("Successfully Deposited");
					}
				else
					System.out.println("wrong account number");
				break;
				
			case 3:
				System.out.println("enter your account number");
				temp=s.nextInt();
				if(temp==na.accountnumber) {
					if(na.accountbalance==0)
						System.out.println("Your account is empty");
					else {
						System.out.println("enter amount you want: ");
						withdraw=s.nextInt();
					}
				}
						if(withdraw>na.accountbalance) {
							System.out.println("enter valid amount of money: ");
							withdraw=s.nextInt();
							}
						else
							System.out.println("wrong Account number");
						break;
						
						case 4:
							System.out.print("enter your account number:");
							temp=s.nextInt();
							if(temp==na.accountnumber) {
								System.out.println("Your Current balance:"+na.accountbalance);
							}
							else
								System.out.println("wrong Account number");
							break;
						case 5:
							System.out.println("enter your account number");
							temp=s.nextInt();
							if(temp==na.accountnumber) {
								na.display();
							}
							else
								System.out.println("wrong account Number");
							break;
						case 0:
						 quit = true;
							break;
							default:
								System.out.println("choice");break;
					}
			System.out.println("\n");
		}
		while(!quit);
		System.out.println("Thanks");
	}
}

