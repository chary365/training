package oops;

public class BankAccount {
	
	
	String AccountNumber;
	String Name;
	String Ssn;
	String DOB;
	
	BankAccount(){
		
		System.out.println("Account Created");
	}
	
	BankAccount(String Name){
		
		System.out.println("Account Holder name : " +Name);
	}
	
	BankAccount(String Name,int Deposit)
	{
		System.out.println("Account Holder Name2" +Name);
		System.out.println("Deposited Amount :" +Deposit);
	 
	}
	
	
	void Deposit() {
		
	}
	
	void Withdrawl() {
		
	}
	void CheckBalance() {
		
	}
	
	void CheckStatus() {
		
	}

}
