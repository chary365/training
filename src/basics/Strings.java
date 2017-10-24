package basics;

public class Strings {

	public static void main(String[] args) {
		String BookName = "lords of the ring"; 
		String WordChoice = "ring";
		if(BookName.contains(WordChoice)) {
			System.out.println("book contains word " +WordChoice);
		}
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {	
			System.out.println("contains chrome");
		}
		
		String FirstName = "Kannyakanti";
		String LastName = "Chary";
		String PassportNumber = "AD154120551";
		
		System.out.print(FirstName.substring(0,1));
		System.out.print(LastName.substring(0));
		System.out.print(PassportNumber.substring(5));
	}

}
