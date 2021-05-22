package com.skilldistillery.app;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private double rating;
	private int truckID;

	public FoodTruck() {

	}

	public FoodTruck(String truckName, String foodType, double rating, int truckID) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckID = truckID;
	}

//	public FoodTruck(String truckName, String foodType, double rating, int truckID) {
//		this(truckName, foodType, rating, 0.0);
//	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

}
