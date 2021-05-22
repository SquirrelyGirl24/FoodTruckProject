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
			foodTruckApp.chooseFromMenu(input, trucks);

	}

	private FoodTruck[] inputTruck(Scanner input) {
		System.out.println("You can enter up to 5 different food trucks to rate.");
		System.out.println("When you are done naming trucks, enter \"quit\" for the truck name.");

		FoodTruck[] truckArr = new FoodTruck[5];

		for (int i = 0; i < truckArr.length; i++) {
			FoodTruck foodTruck = new FoodTruck();
			System.out.println("Enter the name of the truck: ");
			String truckName = input.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			foodTruck.setTruckName(truckName);
			System.out.println("Enter the type of food they serve: ");
			foodTruck.setFoodType(input.nextLine());
			System.out.println("Enter a rating of 1-5 for this food truck: ");
			foodTruck.setRating(input.nextDouble());
			input.nextLine();
			truckArr[i] = foodTruck;
		}

		return truckArr;
	}

	private void printMenu() {
		System.out.println("\n** Please choose one of the following: **");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program. \n");
	}

	private void chooseFromMenu(Scanner input, FoodTruck[] trucks) {
		int choice = 0;
		do {
			printMenu();
			System.out.println("Enter your selection 1-4: ");
			choice = input.nextInt();

			if (choice > 4 || choice < 1) {
				System.out.println("Invalid selection. Please try again.");
				continue;
			}
			switch (choice) {
			case 1:
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
		} while (choice < 4 || choice > 1);

	}

	private void displayTrucks(FoodTruck[] trucks) {
		System.out.println("All food trucks:");
		for (int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i].toString());
		}
	}

	private void seeAvgRating(FoodTruck[] trucks) {
		double sumRatings = 0;
		for (int i = 0; i < trucks.length; i++) {
			sumRatings += trucks[i].getRating();
		}
		double avg = sumRatings / trucks.length * 1.0;
		System.out.println("Average food truck rating: " + avg);
	}

	private void seeHighRating(FoodTruck[] trucks) {
		FoodTruck highRating = trucks[0];
		int ties = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getRating() > highRating.getRating()) {
				highRating = trucks[i];
			} else if (trucks[i].getRating() == highRating.getRating()) {
				ties++;
			}
		}
		System.out.println("The highest rated truck is: ");
		System.out.println(highRating);
		if (ties > 0) {
			System.out.println("Food trucks tied for highest-rated: ");
			for (FoodTruck foodTruck : trucks) {
				if (highRating.getRating() == foodTruck.getRating()
						&& !highRating.getTruckName().equals(foodTruck.getTruckName())) {
					System.out.println(foodTruck);
				}
			}
		}
	}

}
