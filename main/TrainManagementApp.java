package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 3 : Track unique Bogie Id's
 * 
 * Description:
 * This class ensures that duplicate bogie ID are not added into the train 
 * formation using HashSet.
 * 
 * This use case maps uniqueness validation using Set.
 * 
 * @author Developer
 * @version 3.0
 * 
 */
public class TrainManagementApp {

	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("==UC 3 : Track Unique Bogie ID's==");
		System.out.println("==================================");
		
		Set<String> bogies = new HashSet<>();
		bogies.add("BG-101");
		bogies.add("BG-102");
		bogies.add("BG-103");
		
		
		bogies.add("BG-101");
		bogies.add("BG-103");
		
		System.out.println("Bogie ID's After Insertion");
		System.out.println(bogies);
		System.out.println();
		System.out.println("UC3 uniqueness validation completed.");
		System.out.println("Track Unique ID");
		
		
		

		
	}

}
