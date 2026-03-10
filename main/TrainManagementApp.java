package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 10 : Count total seats in Train
 * 
 * Description:
 * This class aggregates seating capacity of all bogies in a single total
 * using Stream reduce().
 * 
 * This maps aggregation logic using reduce().
 * 
 * @author Developer
 * @version 10.0
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
		System.out.println("======================================");
		System.out.println("==UC 10 : Count total seats in Train==");
		System.out.println("======================================");
		
		List<Bogie> bogies=new ArrayList<>();
		
		System.out.println();
		
		bogies.add(new Bogie("First class",30));
		bogies.add(new Bogie("Cargo",100));
		bogies.add(new Bogie("Sleeper",45));
		bogies.add(new Bogie("AC Chair",28));
		bogies.add(new Bogie("AC Chair",15));
		bogies.add(new Bogie("Cargo",76));
		
		System.out.println("All Bogies : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		System.out.println();
		
		int total = bogies.stream().map(b -> b.getCapacity()).reduce(0,Integer::sum);
		
		System.out.println("Total seating capacity of Train : " + total);
		
		
		
		
		
		

		
	}

}
