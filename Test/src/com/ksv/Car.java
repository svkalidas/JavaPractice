package com.ksv;

import java.util.StringJoiner;

public class Car extends Vehicle{

	@Override
	String getCharaterestics() {
		StringJoiner chareterestics = new StringJoiner(" and ");
		chareterestics.add(super.getCharaterestics());
		return chareterestics.add("Max speed 300 km/hr").toString();
	}
}
