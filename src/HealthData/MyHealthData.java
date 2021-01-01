package HealthData;

//Assignment 3: MyHealthData.java

//This system maintains important health information about a patient's maximum and target heart rates, etc.
//Note: This class assumes values passed to the set methods are correct.
//REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!

/**
 * Class MyHealthData that stores Records of Patients in private variables and has setters and getters for every one of them
 * class includes 7 setters and 7 methods, 1 method to calculate the age of patient, 1 method to calculate the
 * MaximumHeartRate, 1 method to calculate MaximumTargetHeartRate, 1 method to calculate MinimumTargetHeartRange, 1 method to calculate BMI 
 * of Patient and 1 method named displayMyHealthData to display the output in the specified format
 * A total of 20 methods
 * @author Ehsan
 *
 */
public class MyHealthData {

	//TO DO: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THE TYPES.

	//START CODE
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
	//END CODE

	// TO DO: INCLUDE YOUR CONSTRUCTOR HERE 
	//START CODE
	/**
	 * Setting constructor for class MyHealthData
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param height
	 * @param weight
	 * @param birthYear
	 * @param currentYear
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear ) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	//END CODE

	//TO DO: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME SRE ALREADY PROVIDED FOR YOU BELOW

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * @return the currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * @param currentYear the currentYear to set
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * gets age of patient by subtracting birth year from current year, getting these values using their
	 * respective getters
	 * @return age in int
	 */
	public int getAge() {
		return (getCurrentYear() - getBirthYear());
	}
	/**
	 * gets maximumheartrate of patient by subtracting age from value 220,
	 * gets age by using its respective getter
	 * @return maximumheartrate in int
	 */
	public int getMaximumHeartRate() {
		return (220 - getAge());
	}
	/**
	 * gets MinimumTargetHeartRate by taking 50% of MaximumHeartRate
	 * gets MaximumHeartRate by its respective getter
	 * @return MinimumTargetHeartRate as double
	 */
	public double getMinimumTargetHeartRate() {
		return (.5 * getMaximumHeartRate());
	}
	
	
	/**
	* gets MaximumTargetHeartRange by taking 85% of MaximumHeartRate
	 * gets MaximumHeartRate by its respective getter
	 * @return MaximumTargetHeartRange as double
	 */
	public double getMaximumTargetHeartRange() {
		return (.85 * getMaximumHeartRate());
	}


	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

	/**
	 * gets Patients BMI
	 * @return BMI as double
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	/**
	 * void method that uses printf statements to specify the output in the specified format
	 * gets respective values using its getters
	 */
	public void displayMyHealthData() 
	{ 

		//TO DO: HINT: USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY.

		// START CODE

		System.out.printf("\nPatient's First Name: %s \n",getFirstName());
		System.out.printf("Patient's Last Name: %s \n",getLastName());
		System.out.printf("Patient's Gender: %s \n",getGender());
		System.out.printf("Patient's Birth Year: %d \n",getBirthYear());
		System.out.printf("Patient's Height: %.2f \n",getHeight());
		System.out.printf("Patient's Weight: %.2f \n",getWeight());
		System.out.printf("Patient's Age: %d \n",getAge());
		System.out.printf("Patient's BMI: %.2f \n",getBMI());
		System.out.printf("Patient's Maximum Heart Rate: %d \n",getMaximumHeartRate());
		System.out.printf("Patient's Minimum Target Heart Range: %.2f \n",getMinimumTargetHeartRate());
		System.out.printf("Patient's Maximimum Target Heart Range: %.2f \n",getMaximumTargetHeartRange());
		System.out.println();

		
		
		
		//END CODE

		//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
	} 

} // end class MyHealthData



