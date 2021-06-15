package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
	
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		//Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
		for(String str: strings){
			System.out.println(str);
		}
		
		//Case-insensitive sort with an anonymous class
		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		System.out.println("Sort with comparator");
		for(String str: strings){
			System.out.println(str);
		}
		Collections.sort(strings);
		mySolution(strings);
	}
	
	 static void mySolution( List<String> dataList){
		
		//case insensitive sort with lambda expression.
		System.out.println("sort with comparator (lambda)");
		Collections.sort(dataList, (str1, str2) -> str1.compareToIgnoreCase(str2));
		 
		//Iterating a collection using foreach method.
		System.out.println("Iterating a collection using foreach method.");
		dataList.forEach(str -> System.out.println(str));
	}
	
}
