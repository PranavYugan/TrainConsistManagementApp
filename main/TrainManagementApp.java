package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 4 : Maintain Ordered Bogie Consist
 * 
 * Description:
 * This class models the physical chaining of train bogies 
 * using LinkedList for ordered operations.
 * 
 * This maps positional operations using LinkedList.
 * 
 * @author Developer
 * @version 4.0
 * 
 */
public class TrainManagementApp {

	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("==UC 4 : Maintain Ordered Bogie Consist==");
		System.out.println("=========================================");
		
		List<String> trainConsist =new LinkedList<>();
		
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		
		System.out.println("Initial Train Consist : ");
		System.out.println(trainConsist);
		System.out.println();
		trainConsist.add(2,"Pantry Car");
		System.out.println("'Pantry Car' Inserted at position 2 : ");
		System.out.println(trainConsist);
		System.out.println();
		
		trainConsist.removeFirst();
		trainConsist.removeLast();
		
		System.out.println("After removing first and last bogie : ");
		System.out.println(trainConsist);
		
		
		
		
		

		
	}

}
