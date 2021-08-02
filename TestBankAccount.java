package com.codingdojo.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount tester = new BankAccount();
		System.out.println(tester.getCheckingBalance());
		System.out.println(tester.getSavingsBalance());
		System.out.println(tester.getAccountNumber());
		tester.deposit("Checking", 312.56);
		System.out.println(tester.getCheckingBalance());
		tester.deposit("Savings", 28);
		System.out.println(tester.getSavingsBalance());
		tester.withdraw("savings", 1000);
		System.out.println(tester.getSavingsBalance());
		tester.withdraw("checking", 100.08);
		System.out.println(tester.getCheckingBalance());
		
	}

}
