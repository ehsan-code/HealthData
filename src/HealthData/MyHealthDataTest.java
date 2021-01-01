package HealthData;
import java.util.Scanner;
/**
 * MyHealthDataTest class that instantiates object of MyHealthData and assigns values
 * using Scanner object. Class has one main method
 * @author Ehsan
 */
public class MyHealthDataTest {
	/**
	 *Main method that instantiates object of Scanner Class with System.in as parameter
	 *Prompts user for input in a specified manner
	 *Instantiates  object of class MyHealthData and assigns values using scanner methods .next, .nextDouble and .nextInt
	 *displays output using MyHealthData method display.MyHealthData  
	 * @param args
	 */
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in); // instantiates scanner object named input

		System.out.println("Enter Patient's First Name, Last Name, Gender, Height in inches, Weight in pounds, birthYear, CurrentYear");
		System.out.println("Delimmitted by the Enter Key"); // prompts for user input in the specified manner
		MyHealthData mhd = new MyHealthData(input.next(), input.next(), 
				input.next(), input.nextDouble(), 
				input.nextDouble(), input.nextInt(),input.nextInt());	// assigns value to constructor with scanner methods

		mhd.displayMyHealthData(); // uses MyHealthData method displayMyHealthData to output the 


	}

}
