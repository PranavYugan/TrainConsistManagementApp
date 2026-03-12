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
		System.out.println("============================================");
		System.out.println("==UC 16 : Manual Sorting using Bubble Sort==");
		System.out.println("============================================");
		
		
		int[] capacities = {72,56,24,70,60};
		System.out.println("Original Capacities : ");
		for (int num : capacities) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println();
		
        int n = capacities.length;
        for (int i =0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j+1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j+1];
                    capacities[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Capacities : ");
        for (int num : capacities) {
            System.out.print(num + " ");
        }

	}

}