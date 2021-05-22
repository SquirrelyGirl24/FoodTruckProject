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
		String truckName = input.nextLine()
				if (truckName.equalsIgnoreCase("N")) {
					FoodTruck[] quitArr = 
					return quitArr; 
				}
				else {
					System.out.println("Enter the type of food they serve: ");
					foodType = input.nextLine();
					
					do {
						System.out.println("Enter a rating of 1-5 for this food truck: ");
						rating = input.nextDouble();
						if (rating > 5 || < 0) {
							System.out.println("Invalid rating. Please try again.");
						}
						else {
							(rating < 5 || > 0);
							input.nextLine();
						}
					while 
						System.out.println("Do you have another food truck to rate? Y or N");
						if (inputTruck.equalsIgnoreCase("Y")) {
						// what goes here?????? 	
						}
						else {
							(inputTruck.equalsIgnoreCase("N"));
// *** input ends if N is selected, take this as quit and end the program continues
						}
						
					}
					
				}
		return null;
	}
	
	private boolean chooseFromMenu(Scanner input, FoodTruck[] trucks) {
		// TODO Auto-generated method stub
		return false;
	}

	private void printMenu() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}

// Please choose one of the following:
// 1. List all existing food trucks.
// 2. See the average rating of food trucks.
// 3. Display the highest-rated food truck.
// 4. Quit the program.
// *** run this menu till the user chooses quit
// when quit is chosen, display Thank you for using the Food Truck App, have a great day!
// *** if <5 trucks were entered only display those entered, no null

