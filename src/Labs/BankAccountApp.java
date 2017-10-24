package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Ac1 = new BankAccount("1516516" , 259);
		BankAccount Ac2 = new BankAccount("8722251" , 2000);
		BankAccount Ac3 = new BankAccount("6542211" , 3000);
		
		Ac1.setName("jim");
		System.out.println(Ac1.getName());
		Ac1.MakeDeposit(250);
		Ac1.Transfer(10);
		Ac1.Transfer(12.95);
		Ac1.MakeDeposit(52.37);
		Ac1.Purchase(3.99);
	}

}


class BankAccount {
	// properties
	
	private static int Id = 1000;
	private String AccountNumber;
	private String SSN;
	private static final String RoutingNumber = "21545421";
	private String Name;
	private double Balance;
	


//constructor
 
public BankAccount(String SSN , double initDeposit) {
	Balance = initDeposit;
	this.SSN = SSN;
	Id++;
	setAccountNumber();
}

public void setAccountNumber() {
	int random = (int) (Math.random() * 100);
	AccountNumber = Id + random + SSN.substring(0, 2);
	System.out.println(" your accnt no : " +AccountNumber);
	
}

public void setName(String Name) {
	this.Name = Name;
}
public String getName() {
	return Name;
}

public void Transfer(double Amount)
{
	Balance = Balance - Amount;
	System.out.println("Transfer ; " +Amount);
    ShowBalance();
}

public void Purchase(double Amount) {
	Balance = Balance - Amount;
	System.out.println("Purchase : " +Amount);
	ShowBalance();
}

public void MakeDeposit(double Amount) {
	Balance = Balance + Amount;
	System.out.println("Making Deposit : " +Amount);
	ShowBalance();
}

public void ShowBalance() {
	System.out.println("Balance : " +Balance);
}
}