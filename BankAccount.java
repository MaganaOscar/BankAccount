package com.codingdojo.BankAccount;
import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private long accountNumber;
	private static int accounts = 0;
	private static double vaultBalance = 0;
	
	public BankAccount() {
		checkingBalance = 0;
		savingsBalance = 0;
		accountNumber = getRandomAccountNumber();
		accounts++;
	}
	
	public void deposit(String account, double amount) {
		account = account.toLowerCase();
		if (account.equals("checking")) {
			checkingBalance += amount;
			vaultBalance += amount;
		} else if (account.equals("savings")) {
			savingsBalance += amount;
			vaultBalance += amount;
		}
	}
	
	public void withdraw(String account, double amount) {
		account = account.toLowerCase();
		if (account.equals("checking") && checkingBalance >= amount) {
			checkingBalance -= amount;
			vaultBalance -= amount;
		} else if (account.equals("savings") && savingsBalance >= amount) {
			savingsBalance -= amount;
			vaultBalance -= amount;
		}
	}
	
	public double totalBalance() {
		return checkingBalance + savingsBalance;
	}
	
	public long getRandomAccountNumber() {
		Random rand = new Random();
		String accountNumStr = "";
		
		for (int i = 0; i < 10; i++) {
			accountNumStr += rand.nextInt(10);
		}
		return Long.parseLong(accountNumStr);
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public static int numAccounts() {
		return accounts;
	}
	
	public static double vaultBalance() {
		return vaultBalance;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
//	public void setCheckingBalance(double checkingBalance) {
//		this.checkingBalance = checkingBalance;
//	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
//	public void setSavingsBalance(double savingsBalance) {
//		this.savingsBalance = savingsBalance;
//	}
}
