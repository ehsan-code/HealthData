package HealthData;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Junit test class that asserts the methods in the class MyHealthData with one void method named heartRateTest that uses method
 * assertEquals to compare two values. if there is a difference the program fails, else the junit status is returned as success
 * @author Ehsan
 *
 */
class MyHealthDataTest2 {

	/**
	 * Instantiating an object of MyHealthData with dummy values
	 */
	MyHealthData mhd = new MyHealthData(null, null, null, 98, 160, 1995, 2020);

	/**
	 * Method that tests the heart rate methods
	 */
	@Test
	void heartRateTest() {	
		assertEquals(195.00, mhd.getMaximumHeartRate(),0.0f);  // asserts if the expected value 195, is equal to the method value
		assertEquals(165.75, mhd.getMaximumTargetHeartRange(),0.0f); // asserts if the expected value 165.75, is equal to the method value
		assertEquals(97.50, mhd.getMinimumTargetHeartRate(),0.0f); // asserts if the expected value 97.52, is equal to the method value
		assertEquals(11.7, mhd.getBMI(),0.1f); // asserts if the expected value 11.7, is equal to the method value
		
		/**
		 * un-commenting this line of code will change birthYear of Object mhd
		 * resulting in change of MAximumHeartRate values and assert statement will return an error
		 */
		mhd.setBirthYear(1996);	// sets value of BirthYear to 1996, changing the heart rate values
		
		assertEquals(195.00, mhd.getMaximumHeartRate(),0.0f); // asserts if the expected value 195, is equal to the method value	
	}

}
