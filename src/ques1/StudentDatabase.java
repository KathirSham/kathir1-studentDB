package ques1;

public class StudentDatabase {

	private void studentinfo() {
		
		System.out.println("Student 1 : kathir");
		System.out.println("Student 2 : kathir1");
		System.out.println("Student 3 : kathir2");
	}
	private void marks() {
		System.out.println("30");
		System.out.println("40");
		System.out.println("50");

	}
	
	private void address() {
		System.out.println("chennai");

	}
	
	public static void main(String[] args) {
		StudentDatabase ss = new StudentDatabase();
		ss.address();
		ss.marks();
		ss.studentinfo();
	}
}
