package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 6 : Map Bogie to Capacity (HashMap)
 * 
 * Description:
 * This class associates each bogie with its seating or load capacity
 * using a key-value mapping structure.
 * 
 * This maps lookup-based access using HashMap.
 * 
 * @author Developer
 * @version 6.0
 * 
 */
public class TrainManagementApp {

	public static void main(String[] args) {
		System.out.println("=================================");
		System.out.println("==UC 6 : Map Boogie to Capacity==");
		System.out.println("=================================");
		
		Map<String,Integer> capacity = new HashMap<>();
		
		System.out.println();
		
		capacity.put("First class",30);
		capacity.put("Cargo",100);
		capacity.put("Sleeper",45);
		capacity.put("AC Chair",28);
		
		System.out.println("Bogie Capacity details : ");
		for(Map.Entry<String,Integer> entry : capacity.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		
		
		
		
		

		
	}

}
