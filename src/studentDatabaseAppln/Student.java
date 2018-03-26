package studentDatabaseAppln;

import java.util.Scanner;

public class Student {

	private String firstName;

	private String lastName;

	private int gradeYear;

	private String studentID;

	private String courses = "";

	private int tutionBalance = 0;

	private static int costOfcourse = 600;

	private static int id = 1000;

	// constructor : prompt user to enter student's name and year

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1. Freshmen\n2. Sophmore \n3. Junior \n4. Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		// System.out.println(firstName + " " + lastName + " " + gradeYear + " "
		// + studentID);
	}

	// Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter a course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costOfcourse;
			} else {
				break;
			}

		} while (1 != 0);

		// System.out.println("ENROLLED IN : " + courses);
	}

	// View balance
	public void viewbalance() {
		System.out.println("Your Balance is : $" + tutionBalance);
	}

	// pay tuition
	public void payTution() {
		viewbalance();
		System.out.print("Enter your payment amount : $");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		tutionBalance -= amount;
		System.out.println("Thank you for your payment of $" + amount);
		// viewbalance();
	}

	// show status
	public String showInfo() {

		return "Name : " + firstName + " " + lastName + "\nGrade Level : " + gradeYear + "\nStudent ID : " + studentID
				+ "\nCourses Enrolled : " + courses + "\nTution Balance : " + tutionBalance;
	}

}
