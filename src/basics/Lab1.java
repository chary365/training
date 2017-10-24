package basics;

public class Lab1 {
	
	
	
	public static void main(String[] args) {
		System.out.println(fact(0));
		
		System.out.println(sum(9));
		
		int[] numbers = {545, 545, -52, 54, 1, 3, 7, 89};
		System.out.println(FindMin(numbers));
		
	}
	
	public static int FindMin(int[] arr) {
		int min = arr[0];
		for (int n=0; n < arr.length ;n++) {
			if(arr[n] < min)
			{
				min = arr[n];
			}
			
		}return min;
		
		
	}
	public static int sum(int n) {
		int sum=0;
		for(int i = 0; i <= n ; i++) {
			sum = sum + i;
		} return sum;
	}
	
	
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return fact(n-1)*n;

	}
	
}
