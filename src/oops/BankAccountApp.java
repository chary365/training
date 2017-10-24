package oops;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount Ac1 = new BankAccount();
		Ac1.AccountNumber = "002120";
		
		BankAccount Ac2 =  new BankAccount("Current account");
		Ac2.AccountNumber = "002122";
				
		BankAccount Ac3 = new BankAccount("Saving account , 5000");
		Ac3.AccountNumber = "002123";

	}

}
