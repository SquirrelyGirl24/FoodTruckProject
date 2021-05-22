package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		
		foodTruckApp.launchApp(input, foodTruckApp);
		
		input.close();
		
	}

	private void launchApp(Scanner input, FoodTruckApp foodTruckApp) {
		System.out.println("Welcome to the Food Truck App!");
		FoodTruck[] trucks = foodTruckApp.inputTruck(input);

		boolean runMenu1 = true;
		while (runMenu1) {
			foodTruckApp.printMenu();
			runMenu1 = foodTruckApp.chooseFromMenu(input, trucks);
		}
		
	}

	private FoodTruck[] inputTruck(Scanner input) {
		System.out.println("You can enter up to 5 different food trucks to rate.");
		System.out.println("Enter the name of the truck: ");
		FoodTruck foodTruck = new FoodTruck();
		String inputTruck = input.nextLine();
		String truckName = input.nextLine();
		foodTruck.setTruckName(truckName); 
				if (truckName.equalsIgnoreCase("N")) {
					FoodTruck[] quitArr = new FoodTruck[5]; 
					return quitArr; 
//					make an array
				}
				else {
					System.out.println("Enter the type of food they serve: ");
					String foodType = input.nextLine();
					foodTruck.setFoodType(foodType);
					
					do {
						System.out.println("Enter a rating of 1-5 for this food truck: ");
						double rating = input.nextDouble();
						foodTruck.setRating(rating);
						if (rating > 5 || rating < 0) {
							System.out.println("Invalid rating. Please try again.");
						}
						else {
							foodTruck.setRating(rating);
						System.out.println("Do you have another food truck to rate? Y or N");
						if (inputTruck.equalsIgnoreCase("Y")) {
							System.out.println("Enter the name of the truck: ");
							foodTruck.setTruckName(truckName); 
//							 what goes here?????? enter the name of the new truck 	
						}
//						else {
						} while (inputTruck != "N") 
// *** input ends if N is selected, take this as quit and end the program continues
//						}
						
//					}
					
		return null;
	}
	
	private void printMenu() {
		System.out.println("** Please choose one of the following: **");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}

	private boolean chooseFromMenu(Scanner input, FoodTruck[] trucks) {
		int choice = 0;
		do {
			System.out.println("Enter your selection 1-4: ");
			choice = input.nextInt();
			
			if (choice > 4 || < 1) {
				System.out.println("Invalid selection. Please try again.");
			}
		} while (choice < 4 || > 1);
		
		switch (choice) {
		case 1;
			displayTrucks(trucks);
			break;
		case 2:
			seeAvgRating(trucks);
			break;
		case 3: 
			seeHighRating(trucks);
			break;
		case 4:
			System.out.println("Thank you for using the Food Truck App, have a great day!");
			break;
		}
		return false;
// *** run this menu till the user chooses quit
		
	}


	
	
	

}

// *** if <5 trucks were entered only display those entered, no null

