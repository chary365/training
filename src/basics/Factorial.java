package basics;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(sum(9));
		
		System.out.println("Factorial = " + fact(5));
		
		int[] numbers = {1, 2 , 5 , -50 , -625 , 554};
		System.out.println("min : " + FindMin(numbers));
		System.out.println("Avg : " +FindAvg(numbers));

	}
	
	public static int FindAvg(int[] arr) {
		int sum =0;
		for (int n=0; n < arr.length; n++) {
			sum = sum + arr[n];
		}
		System.out.println("sum : " + sum);
		return sum/arr.length;
	}
	
	public static int FindMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}return min;
	}
	
	 public static int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n;i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println("=" +sum);
		
		}
		return sum;	
	} 
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		
		return fact(n-1) * n;
	}

}
