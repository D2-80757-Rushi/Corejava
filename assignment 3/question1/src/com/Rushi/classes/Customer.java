package com.Rushi.classes;

public class Customer {
	int accountNumber;
	int pendingBalance;
	int  totalOfAllItemsChargedByTheCustomerThisMonth;
	int totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
	int allowedCreaditLimit;
	public Customer(int accountNumber, int pendingBalance,
			int totalOfAllItemsChargedByTheCustomerThisMonth,
			int totalOfAllCreditsAppliedToTheCustomersAccountThisMonth, int allowedCreaditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.pendingBalance = pendingBalance;
		this.totalOfAllItemsChargedByTheCustomerThisMonth = totalOfAllItemsChargedByTheCustomerThisMonth;
		this.totalOfAllCreditsAppliedToTheCustomersAccountThisMonth = totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
		this.allowedCreaditLimit = allowedCreaditLimit;
	}
	
	public void calculateNewBalance() {
		int newBalanceForNextMonth= (pendingBalance+totalOfAllItemsChargedByTheCustomerThisMonth)-totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
		
		if(newBalanceForNextMonth > allowedCreaditLimit) {
			System.out.println("Creadit limit exceeded.");
		}
		else
		{
			System.out.println("The new balance for next month is "+ newBalanceForNextMonth);
		}
		
	}
	
}
