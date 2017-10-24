package basics;

public class cities {
	public static void main(String[] args) {
		String[] cities = {"california","ohio","illinois","new york"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] countries;
		countries = new String[5];
		countries[0] = "hyderabad";
		countries[1] = "delhi";
		countries[2] = "pune";
		countries[3] = "mumbai";
		countries[4] = "bengalore";
		System.out.println(countries[0]);
		
		System.out.println("*************");
		
		String[] states = new String[5];
		states[0] = "hyderabad";
		states[1] = "delhi";
		states[2] = "pune";
		states[3] = "mumbai";
		states[4] = "bengalore";
		int i = 0;
		do {
			System.out.println( states[i]);
			i= i + 1;
		} while (i<5);
		
		
		for (int x=0; x<5; x++) {
			System.out.println("States :" + states[x]);
		}
		System.out.println("___________________________________________________");
		int n = 0;
		boolean statefound = false;
		while (!
				statefound) {
			String state = states[n];
			System.out.println(state);
			if (state == "mumbai") {
				System.out.println("statefound");
				statefound = true;
				
			}n++;
			
		}
		
		
	}

}