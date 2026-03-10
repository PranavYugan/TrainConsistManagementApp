package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 2 : Add Passenger Bogies to train
 * 
 * Description:
 * This class demonstrates how passenger bogies can be 
 * managed dynamically using ArrayList operations. 
 * 
 * This use case maps CRUD operations using ArrayList.
 * 
 * @author Developer
 * @version 2.0
 * 
 */
public class TrainManagementApp {

	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("==UC 2 : Add Passengers to Bogies Train==");
		System.out.println("=========================================");
		
		List<String> trainConsist = new ArrayList<>();
		System.out.println("Train Initialized Successfully.");
		System.out.println();
		System.out.println("Before adding Bogies : " );
		System.out.println(trainConsist);
		
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		System.out.println();
		System.out.println("After adding Bogies : " );
		System.out.println(trainConsist);
		System.out.println();
		trainConsist.remove(1);
		System.out.println();
		System.out.println("After removing 'AC Chair' : " );
		System.out.println(trainConsist);
		System.out.println();
		System.out.println("Checking if Sleeper exists : " );
		System.out.println("Contains Sleeper ? : " + trainConsist.contains("Sleeper"));
		System.out.println();
		System.out.println("Final Train Passenger Consist : " );
		System.out.println(trainConsist);
		
		System.out.println();
		
		System.out.println("UC2 Operations completed successfully");
		
		
		

		
	}

}
