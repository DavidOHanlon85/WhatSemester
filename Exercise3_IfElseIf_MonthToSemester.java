/**
 * 
 */
package slideDeckTasks;

/**
 * 
 */
public class Exercise3_IfElseIf_MonthToSemester {

	public static void main(String[] args) {
		
		// Declare and Initialise Variables
		
		int month = 2;
		
		if (month == 9 || month == 10 || month == 11 || month == 12 || month == 1) {
			System.out.println("Semester 1");
		} else if (month == 2 || month == 3 || month == 4 || month == 5){
			System.out.println("Semester 2");
		} else if (month == 6 || month == 7 || month == 8){
			System.out.println("Summer");
		} else {
			System.out.println("Invalid input");
		}

	}

}
