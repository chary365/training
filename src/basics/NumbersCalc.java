package basics;

public class NumbersCalc {
	public static void main (String[] args)	{
		System.out.println("Program is starting");
		PrintName();
		int numA = 10;
		int numB = 20;
		AddNumbers(numA, numB);
		
	}
	static void PrintName() {
		System.out.println("My name is Chary");
	}
	static void AddNumbers(int numA,int numB) {
		int sum = numA * numB;
		System.out.println("sum :" + sum);
		
	}
	/*static void MultiplyNumbers()
	*/

}

