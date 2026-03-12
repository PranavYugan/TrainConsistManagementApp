package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 * 
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception
 * 
 * This maps fail-fast validation using checked exceptions.
 * 
 * @author Developer
 * @version 14.0
 * 
 */
public class TrainManagementApp {
	
	static class InvalidCapacityException extends Exception {
		public InvalidCapacityException(String message) {
			super(message);
		}
	}
	
	static class Bogie{
		String name;
		int capacity;
		
		public Bogie(String name,int capacity) throws InvalidCapacityException {
			if(capacity <= 0) {
				throw new InvalidCapacityException("Error : Capacity must be greater than zero");
			}
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
	

	public static void main(String[] args) throws InvalidCapacityException{
		System.out.println("==========================================");
		System.out.println("==UC 14 : Handle Invalid Capacity Input ==");
		System.out.println("==========================================");
		
		List<Bogie> bogies=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Enter Bogie Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Capacity: ");
				int quantity=sc.nextInt();
				bogies.add(new Bogie(name,quantity));
				System.out.println(name + " -> " + quantity);
				sc.nextLine();
			}
			catch(InvalidCapacityException e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		
		
		
		
		
		
		
		
		

		
	}

}
