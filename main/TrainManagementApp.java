package com.seveneleven.trainmanagementapp.main;
import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS
 * 
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 * 
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling insafe combinations using structured
 * exception handling blocks
 * 
 * This maps runtime safety handling using try-catch-finally
 * 
 * @author Developer
 * @version 15.0
 * 
 */
public class TrainManagementApp {

	static class CargoSafetyException extends RuntimeException {
		public CargoSafetyException(String message) {
			super(message);
		}
	}

	static class GoodsBogie{
		String type;
		String cargo;

		GoodsBogie(String type,String cargo) throws CargoSafetyException{
			if(type.equals("Cylindrical") && cargo.equals("Coal")) {
				throw new CargoSafetyException("Error : Unsafe Cargo Assignment ");

			}
			else if(type.equals("Rectangular") && cargo.equals("Petroleum")) {
				throw new CargoSafetyException("Error : Unsafe Cargo Assignment ");

			}
			this.type=type;
			this.cargo=cargo;
		}

		public String getType() {
			return type;
		}

		public String getCargo() {
			return cargo;
		}

		static void assignCargo(ArrayList<GoodsBogie> train,String type,String cargo) {
			try {
				train.add(new GoodsBogie(type,cargo));
				System.out.println(type + " -> " + cargo);
			}
			catch(CargoSafetyException e) {
				System.out.println(e.getMessage());
			}
		}



	}

	public static void main(String[] args) throws CargoSafetyException {
		System.out.println("=================================");
		System.out.println("==UC 15 : Safe Cargo Assignment==");
		System.out.println("==================================");

		ArrayList<GoodsBogie> train = new ArrayList<>();
		GoodsBogie.assignCargo(train,"Cylindrical","Petroleum");
		System.out.println("Cargo Validation Completed for Cylindrical Bogie.");
		System.out.println();
		GoodsBogie.assignCargo(train,"Rectangular","Petroleum");
		System.out.println("Cargo Validation Completed for Rectangular Bogie.");
	}

}