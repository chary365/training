package Lab2;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student stu1 = new Student("Chary","9014153726");
		Student stu2 = new Student("Shruthi","8790546122");
		Student stu3 = new Student("Kalavathi","8897999134");
		Student stu4 = new Student("KVchary","9290600967");
	    }
	}
	
	class Student {
		private static int iD=1000;
		private String name;
		private String ssn;
		private String email;
		private String UserId;
	
	public Student (String name , String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	private void setEmail() {
	
		email = name.toLowerCase() + "." + iD + "@univ.com";
		System.out.println("Your email ID: " +email);
	}
	private void setUserId() {

		int min = 1000;
		int max = 9000;
		int randNum = (int) ((Math.random() * (max - min)));
		randNum = randNum+min;
		System.out.println(randNum);
		UserId = iD + randNum + ssn.substring(6) ;
		System.out.println("Your User Id : " + UserId);
	}
}
