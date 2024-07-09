package Ques_4;

public class Account {
	double balance;  // initialising data member
	//Constructor creation passing no argument
	public Account() {
		this.balance = 2500;
	}
	//Constructor creation passing arguments
	public Account(double balance) {
		this.balance = balance;
	}
	//getter method to get balance amount
	public double getbalance() {
		return balance;
	}
	//Setter method to update/modify balance amount
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	//instance method name called withdraw
	public void withdraw(double amount) {
		if(amount >0 && amount<balance) {
			this.balance-=amount;
			System.out.println("Balance amount : " + this.balance );
		}
		else {
			System.out.println("Invalid amount");
		}
		
		
	}
	//instance method name called deposit
	public void deposit(double de_amount) {
		if(de_amount>0) {
			this.balance+=de_amount;
			System.out.println("Total balance after deposit : " + this.balance);
		}else {
			System.out.println("Invalid and deposit failed");
		}
		
	}	
}
