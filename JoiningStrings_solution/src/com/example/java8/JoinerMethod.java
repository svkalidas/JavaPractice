package com.example.java8;

import java.util.ArrayList;
import java.util.List;

import com.example.java8.model.Person;

public class JoinerMethod {

	public static void main(String[] args) {

		String stooges = String.join(" and ", "Larry", "Curly", "Moe");
		System.out.println(stooges);
		
		String[] states = {"California", "Oregon", "Washington"};
		String statesList = String.join(",", states);
		System.out.println(statesList);
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Austira");
		countries.add("Canada");
		
		String countryList = String.join(" and ", countries);
		System.out.println(countryList);
		
	}		
}
