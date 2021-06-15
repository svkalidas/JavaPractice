package com.study.convert.object;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class ConvertInstanceOfObject {

	public static void main(String[] args) {
		Car car = new Car(700000, "Polo", "Hatchback");
		Bike bike = new Bike();
		bike.setModel("Thunder Bird");
		bike.setType("Royal Enfeild : Cruiser");
		System.out.println(convertObject(car));
		System.out.println("------------");
		System.out.println(convertObject(bike));
		
		
	}
	
	static String convertObject(Object obj){
		StringJoiner result = new StringJoiner(",", "[", "]");
		result.setEmptyValue("");
		
		try {
			Arrays.asList(Introspector.getBeanInfo(obj.getClass(), Object.class).getPropertyDescriptors())
			.stream().filter(pd -> {
				try {
					return Objects.nonNull(pd.getReadMethod().invoke(obj));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			})
			.forEach(pd ->{
					try {
						result.add(pd.getName() +" = "+ pd.getReadMethod().invoke(obj));
					} catch (Exception e) {
						e.printStackTrace();
					}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result.toString();
	}
}
