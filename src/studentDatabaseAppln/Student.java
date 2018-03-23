package studentDatabaseAppln;

import java.util.Scanner;

/**
 * @author anjalygireesh09
 *
 */
public class Student {

	private String firstName;

	private String lastName;

	private int gradeYear;

	private String studentID;

	private String courses = "";

	private String tutionBalance = "";

	private static int costOfcourse = 600;

	private static int id = 1000;

	// constructor : prompt user to enter student's name and year

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1. Freshmen\n2. Sophmore \n3. Junior \n4. Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	// Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses

	public void enroll() {
		System.out.println("Enter a course to enroll(Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (course != "Q") {
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance + costOfcourse;
		}
		System.out.println("ENROLLED IN : " + courses);
		System.out.println("TUTION BALANCE : " + tutionBalance);
	}

	// View balance

	// pay tuition

	// show status

}
