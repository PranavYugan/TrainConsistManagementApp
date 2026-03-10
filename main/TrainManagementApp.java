package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 5 : Preserve Insertion Order of Bogies
 * 
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet
 * 
 * This maps ordered uniqueness using LinkedHashSet.
 * 
 * @author Developer
 * @version 5.0
 * 
 */
public class TrainManagementApp {

	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("==UC 5 : Preserve Insertion order of Bogies==");
		System.out.println("=============================================");
		
		Set<String> formation=new LinkedHashSet<>();
		System.out.println();
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Engine");
		formation.add("Cargo");
		formation.add("Guard");
		
		System.out.println("Bogie's after inserting , including a duplicate : ");
		System.out.println(formation);
		
		
		
		
		
		

		
	}

}
