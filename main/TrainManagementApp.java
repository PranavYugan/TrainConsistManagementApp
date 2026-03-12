package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 12 : Safety Compilance Check for Goods Bogie.	
 * 
 * Description:
 * This class enforces domain safety rules on goods bogies.
 * 
 * This maps real world cargo safety rules using streams.
 * 
 * @author Developer
 * @version 12.0
 * 
 */
public class TrainManagementApp {
	
	static class GoodsBogie{
		String type;
		String cargo;
		
		GoodsBogie(String type,String cargo){
			this.type=type;
			this.cargo=cargo;
		}

		public String getType() {
			return type;
		}

		public String getCargo() {
			return cargo;
		}
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("===================================================");
		System.out.println("==UC 12 : Safety Compilance Check for Goods Bogie==");
		System.out.println("===================================================");
		
		ArrayList<GoodsBogie> train = new ArrayList<>();
		train.add(new GoodsBogie("Cylindrical","Petroleum"));
		train.add(new GoodsBogie("Open","Coal"));
		train.add(new GoodsBogie("Box","Grain"));
		train.add(new GoodsBogie("Cylindrical","Coal"));
		
		System.out.println("Goods Bogies in Train");
		for(GoodsBogie bogie : train) {
			System.out.println(bogie.getType() + " -> " + bogie.getCargo());
		}
		System.out.println();
		boolean isSafe=(train.stream().allMatch(t -> !(t.getType().equals("Cylindrical") && t.getCargo().equals("Coal"))));
		
		System.out.println("Safety Compilance Status : " + isSafe);
		if(isSafe) {
			System.out.println("Train formation is SAFE.");
		}
		else {
			System.out.println("Train formation is NOT SAFE.");
		}
		
		
		
			


		
	}

}
