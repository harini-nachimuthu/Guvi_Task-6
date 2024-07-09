package Ques_4;

public class Main_class {

	public static void main(String[] args) {
		Account a1=new Account();
		System.out.println("Earlier balance amount in account is : "+a1.getbalance());
		a1.withdraw(100);
		a1.deposit(40);
		System.out.println("---------------------");
		Account a2=new Account(500);
		System.out.println("Earlier balance amount in account is : "+a2.getbalance());
		a2.withdraw(1200);
		a2.deposit(1000);
		System.out.println("---------------------");
		Account a3=new Account(-1);
		System.out.println("Earlier balance amount in account is : "+a3.getbalance());
		a3.withdraw(100);
		a3.deposit(300);
		
		
	}

}

