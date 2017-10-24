package oops;

class Person {
	
	String Name;
	String Email;
	String PhoneNo;

	void walk() {
		System.out.println(Name + " is walking");
	}
	void eat() {
		System.out.println(Name + " is eating");

	}
	void sleep() {
		System.out.println(Name + " is sleeping");

	}

	
}


public class demo {
	

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.Name = "joe";
		person1.Email = "agsdjhg@hsdj.com";
		person1.PhoneNo = "54521215";
		
		Person person2 = new Person();
		person2.Name = "sarah";
		person2.Email = "agsdjhg@hsdj.com";
		person2.PhoneNo = "54521215";

		person1.walk();
		person2.eat();
		person1.sleep();
		
		
	}

}
