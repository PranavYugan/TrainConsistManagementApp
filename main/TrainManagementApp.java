package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 9 : Group Bogies by Type
 * 
 * Description:
 * This class groups bogies by using Collectors.groupingBy()
 * 
 * This maps classification logic using groupingBy.
 * 
 * @author Developer
 * @version 9.0
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
		System.out.println("==UC 9 : Grouping Bogies by Type==");
		System.out.println("==================================");
		
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
		
		System.out.println("Grouped Bogies : ");
		System.out.println();
		
		Map<String,List<Bogie>> grouped_bogies= bogies.stream().collect(Collectors.groupingBy(b->b.name));
		
		for(Map.Entry<String, List<Bogie>> entry : grouped_bogies.entrySet()) {
			System.out.println("Bogie Type: " + entry.getKey());
			for(Bogie b:entry.getValue()) {
				System.out.println(b.getName() + " -> " + b.getCapacity());
			}
			System.out.println();
		}
		
		
		
		
		
		

		
	}

}
