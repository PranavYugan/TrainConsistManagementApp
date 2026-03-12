package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * Use Case 13: Performance Comparision (Loops vs Streams)
 * 
 * Description:
 * This class compared execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime() 
 * 
 * This maps performance benchmarking using high-resoltion timing.
 * 
 * @author Developer
 * @version 13.0
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
		System.out.println("====================================================");
		System.out.println("==UC 13 : Performance Comparison (Loops vs Stream)==");
		System.out.println("====================================================");
		
		List<Bogie> bogies=new ArrayList<>();
		List<Bogie> filtered_bogies1 =new ArrayList<>();
		System.out.println();
		
		bogies.add(new Bogie("First class",30));
		bogies.add(new Bogie("Cargo",100));
		bogies.add(new Bogie("Sleeper",45));
		bogies.add(new Bogie("AC Chair",28));
		
		System.out.println("Bogie Capacity details : ");
		for(Bogie b:bogies) {
			System.out.println( b.getName() + " -> " + b.getCapacity());
		}
		System.out.println();
		long start_stream=System.nanoTime();
		List<Bogie> filtered_bogies=bogies.stream().filter(b->b.getCapacity() > 30).toList();
		long end_stream=System.nanoTime();
		
		System.out.println("Stream execution time (ns) : " + (end_stream - start_stream));
		
		long start_loop=System.nanoTime();
		for(Bogie bogie:bogies) {
			if(bogie.getCapacity() >30) {
				filtered_bogies1.add(bogie);
			}
		}
		long end_loop=System.nanoTime();
		
		System.out.println("Loop execution time (ns) : " + (end_loop - start_loop));
		
		
		
		
		
		
		
		
		

		
	}

}
