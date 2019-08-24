package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDataBase {
	static Scanner s = new Scanner(System.in);
	private String FirstName;
	private String LastName;
	private int gradeyear;
	private String StudentId;
	private String courses = "";
	private int Tutionbalance = 0;
	private int CostOfCourse = 600;
	private static int id = 1000;

	// Constructor:prompt user to input Student's name and gradeyear
	public StudentDataBase() {
		System.out.println("ENTER THE FIRSTNAME: ");
		this.FirstName = s.next();

		System.out.println("ENTER THE LASTNAME: ");
		this.LastName = s.next();

		System.out.println("1.Freshman\n2.Junior\n3.Senior\nENTER LEVEL");
		this.gradeyear = s.nextInt();
		setStudentID();
		System.out.println(FirstName + " " + LastName + " " + gradeyear + " " + StudentId);
	}
	// Generate an ID;

	private void setStudentID() {
		// GRADE LEVEL + ID

		this.StudentId = gradeyear + "" + id;
		id++;
	}

	// enroll in courses
	public void enroll() {
		String course;
		do {
			System.out.println("ENTER COURSE TO ENROLL (PRESS Q TO QUIT) ");
			Scanner s = new Scanner(System.in);
			course = s.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				Tutionbalance += CostOfCourse;
			} else
				break;
		} while (1 != 0);

		System.out.println("ENROLLED IN: " + courses);
//		System.out.println("TOTAL BALANCE: " + Tutionbalance);

	}

	// view balance
	public void viewbalance() {
		System.out.println("YOUR BALANCE IS $ " + Tutionbalance);
	}

	// pay Tution
	public void paytution() {
		viewbalance();
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR PAYMENT $ ");
		int money = s.nextInt();
		if (money > this.Tutionbalance) {
			System.out.println("THANK YOU FOR THE PAYMENT OF $ " + money);
			System.out.println("MONEY LEFT $ " + (money - this.Tutionbalance));
			this.Tutionbalance = 0;
		} else {
			this.Tutionbalance -= money;
			System.out.println("THANK YOU FOR THE PAYMENT OF $ " + money);
			viewbalance();
		}
	}

	@Override
	public String toString() {

		return "NAME: " + FirstName + " " + LastName + "\n" + "ID: " + StudentId + "\n" + "COURSES ENROLLED: " + courses
				+ "\n" + "TUTION BALANCE $: " + Tutionbalance;

	}

//  public void showInfo()
//	{
//		System.out.println("NAME "+FirstName+" "+ LastName);
//        System.out.println("ID "+StudentId);
//        System.out.println("COURSES ENROLLED "+courses);
//        System.out.println("TUTION BALANCE "+Tutionbalance);
//		
//	}
}
