package studentDatabaseAppln;

/*
 * Need to create an application to manage student enrolment and balance
 * 
 *  */
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// Ask how many new Students we want to add
		System.out.println("Enter how many Students to be enrolled");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		Student[] students = new Student[numOfStudents];

		// create n number of new students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].showInfo());
		}

		scan.close();
	}

}
