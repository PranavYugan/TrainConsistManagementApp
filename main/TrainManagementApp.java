package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 7 : Map Bogies to Capacity (Comparator)
 * 
 * Description:
 * This class sorts passenger bogies based on seating capacity 
 * using a custom comparator.
 * 
 * This maps custom ordering using Comparator.
 * 
 * @author Developer
 * @version 7.0
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
		System.out.println("==================================");
		System.out.println("==UC 7 : Sort Bogies by Capacity==");
		System.out.println("==================================");
		
		List<Bogie> bogies=new ArrayList<>();
		
		System.out.println();
		
		bogies.add(new Bogie("First class",30));
		bogies.add(new Bogie("Cargo",100));
		bogies.add(new Bogie("Sleeper",45));
		bogies.add(new Bogie("AC Chair",28));
		
		System.out.println("Bogie Capacity details before sorting : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		System.out.println();
		bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
		
		System.out.println("Bogie Capacity details after sorting : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		
		
		
		
		
		

		
	}

}
