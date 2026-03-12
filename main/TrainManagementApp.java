package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 11 : Validate Train ID and Cargo Code
 * 
 * Description:
 * This class validates input formats using Regular Expressions
 * 
 * This maps format validation logic using Pattern matching.
 * 
 * @author Developer
 * @version 11.0
 * 
 */
public class TrainManagementApp {
	
	static class Bogie{
		String name;
		int capacity;
		
		public Bogie(String name,int capacity) {
			this.name=name;
			this.capacity=capacity;
		}

		public String getName() {
			return name;
		}

		public int getCapacity() {
			return capacity;
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("==UC 11 : Validate Train ID and Cargo Code==");
		System.out.println("============================================");
		
		Scanner sc=new Scanner(System.in);
		
		String train_regex="^TRN-\\d{4}$";
		String cargo_regex="^PET-[A-Z]{2}$";
		
		System.out.println("Enter Train ID (Format TRN-1234) :  ");
		String train=sc.nextLine();
		System.out.println("Enter Cargo Code (Format PET-AB) :  ");
		String cargo=sc.nextLine();
		System.out.println();
		System.out.println("Validation Results : ");
		System.out.println("Train ID Valid : " + train.matches(train_regex));
		System.out.println("Cargo Code Valid : " + cargo.matches(cargo_regex));
		
		
		
		
		
		
		

		
	}

}
