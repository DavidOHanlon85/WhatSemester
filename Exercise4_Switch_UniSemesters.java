/**
 * 
 */
package slideDeckTasks;

import java.util.Scanner;

/**
 * 
 */
public class Exercise4_Switch_UniSemesters {

	public static void main(String[] args) {

		// Declare variables

		int month = 5;
		String semester;

		// Instantiate Scanner
		Scanner myScan = new Scanner(System.in);

		// User Prompt

		System.out.println("What month (1 - 12) would you like me to check?");

		month = myScan.nextInt();
		myScan.nextLine();

		// Create Switch statement

		switch (month) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 1:
			semester = "1";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			semester = "2";
			break;
		case 6:
		case 7:
		case 8:
			semester = "Summer";
			break;
		default:
			semester = "Invalid input";
			break;
		}
		
		System.out.println("Semester : " + semester);
		
		myScan.close();

	}

}
