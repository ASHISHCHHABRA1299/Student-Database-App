package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// HOW MANY USERS
		System.out.print("ENTER NUMBER OF STUDENTS TO ENROLL: ");
		Scanner s = new Scanner(System.in);
		int nos = s.nextInt();
		StudentDataBase[] students = new StudentDataBase[nos];
		// CREATE N NUMBER OF NEW STUDENTS
//		StudentDataBase s1=new StudentDataBase();
//		System.out.println("---------------------------");
//		s1.enroll();
//		System.out.println("---------------------------");
//		s1.paytution();
//		System.out.println("---------------------------");
//		System.out.println(s1);
//		System.out.println("---------------------------");
		for (int n = 0; n < nos; n++) {
			students[n] = new StudentDataBase();
			students[n].enroll();
			students[n].paytution();
			System.out.println(students[n]);
		}

	}

}
