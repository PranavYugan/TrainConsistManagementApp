package com.seveneleven.trainmanagementapp.main;
import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 8 : Filter Passengers Bogies using Stream.
 * 
 * Description:
 * This class filters passengers using stream api.
 * 
 * This maps functional filtering using streams.
 * 
 * @author Developer
 * @version 8.0
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
		System.out.println("================================================");
		System.out.println("==UC 8 : Filter Passenger Bogies Using Streams==");
		System.out.println("================================================");
		
		List<Bogie> bogies=new ArrayList<>();
		
		System.out.println();
		
		bogies.add(new Bogie("First class",30));
		bogies.add(new Bogie("Cargo",100));
		bogies.add(new Bogie("Sleeper",45));
		bogies.add(new Bogie("AC Chair",28));
		
		System.out.println("Bogie Capacity details before filtering : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		System.out.println();
		List<Bogie> filtered_bogies= bogies.stream().filter(b->b.getCapacity() > 30).toList();
		
		System.out.println("Bogie Capacity details after filtering : ");
		for(Bogie b:filtered_bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		
		
		
		
		
		

		
	}

}
