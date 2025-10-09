package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Saving;

public class AccountDetails {

	static Scanner sc = new Scanner(System.in);

	static Account account = new Saving();;
	static Account a = new Saving();

	public static Account getAccountById(String accId, Account[] custArr) {

		for (Account a : custArr) {
			if (a != null && a.getId().equals(accId)) {
				account = a;
				return a;
			}
		}

		return null;
	}

	public static void services() {

		System.out.println("1. Check Balance\n" + "2. Withdraw Money\n" + "3. Deposit Money\n" + "4. Exit\n");

		int ch = sc.nextInt();

		do {
			switch (ch) {
			case 1:
				System.out.println("Current Balance is : " + account.getBal());
				break;

			case 2:
				System.out.println("Enter Withdraw Ammount...");
				double wm = sc.nextDouble();
				int check = a.withdrawMoney(account.getBal(), wm);
				if (check == 1) {
					System.out.println("You SuccessFully Withdraw Money...");
				} else if (check == 2) {
					System.out.println("Sorry, but you have to maintain the Minimum Balance...\n"
							+ "You can't withdraw this amount");
				} else if (check == 3) {
					System.out.println("You can only withdraw " + ((account.getBal()) - (Account.mini)) + " money.");
				} else {
					break;
				}
				break;

			case 3:
				break;

			case 4:
				System.out.println("Thanks for Choosing Our Services");
				System.exit(0);

			default:
				System.out.println("Wrong Entery...");
				System.exit(1);

			}

		} while (!(ch == 4));

	}

}
