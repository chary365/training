package basics;

public class SalaryCalculater {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		career = "SoftwareDeveloper";
		System.out.println("My career: " + career);
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 40.50;
		double salary = hoursperweek * weeksperyear * rate;
		System.out.println("My career is " + career + " And my salary = " +rate+ " perhour equals to " + salary);
		
		
		
	}

}
