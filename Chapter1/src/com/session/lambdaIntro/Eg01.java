package com.session.lambdaIntro;

import java.util.Arrays;
import java.util.List;

public class Eg01 {
public static void main(String[] args) {
	
	List<String> cities = Arrays.asList("Bangalore", "Hyderabad", "Cochin",
			"Hyderabad", "Delhi", "Noida");
	
	//Check if delhi is present
	
	
	//Method 1
	boolean found = false;
	for(String city : cities) {
		if(city.equals("delhi")) {
		found = true;
		break;
		}
	}
	
	System.out.println("Found Delhi "+found);
	
	// Method 2 better way  
	System.out.println("Found Delhi "+ cities.contains("delhi"));
}
}
