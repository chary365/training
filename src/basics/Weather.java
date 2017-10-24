package basics;

public class Weather {
	public static void main(String[] args) {
		int Temperature = 20;
		 String suncondition = "sunny";
		
		if (Temperature > 80) {
			System.out.println("temperature is normal you can wear shorts and sleeves");
		}
		
		else if ((Temperature > 65) || (suncondition == "sunny")) {
			System.out.println("temperature is litter cooler");
			System.out.println("wear a hat");
		}
		else {
			System.out.println("wear a shorts and sleeves");
		}
		
		
	}
	

}
