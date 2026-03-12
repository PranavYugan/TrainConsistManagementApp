package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 * 
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 * 
 * This maps optimized sorting using Java library utilities.
 * 
 * @author Developer
 * @version 17.0
 * 
 */
public class TrainManagementApp {


	public static void main(String[] args)  {
		System.out.println("================================================");
		System.out.println("==UC 17 : Sort Bogie Names using Arrays.sort()==");
		System.out.println("================================================");
		
		
		String[] capacities = {"Sleeper","AC Chair","First Class","General","Luxury"};
		System.out.println("Original Bogie Names : ");
		for (String num : capacities) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println();
		
        Arrays.sort(capacities);
        
        System.out.println("Sorted Bogie Names : ");
        for (String num : capacities) {
            System.out.print(num + " ");
        }

	}

}