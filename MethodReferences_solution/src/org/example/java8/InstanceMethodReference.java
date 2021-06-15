package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.example.java8.model.Person;

public class InstanceMethodReference {

	public static void main(String args[]){
		InstanceMethodReference mainClass = new InstanceMethodReference();
		mainClass.sortData();
	}

	public void sortData() {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		/*System.out.println("After solution 1");
		//Anonymous inner class
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				Integer age1 = p1.getAge();
				return age1.compareTo(p2.getAge());
			}
		});;
		
		people.forEach(p -> System.out.println(p));
		
		System.out.println("After solution 2");
		//Lamda
		Comparator<Person> comparator = (p1,p2)->{
			Integer age1 = p1.getAge();
			return age1.compareTo(p2.getAge());
		};
		
		Collections.sort(people, comparator);
		
		people.forEach(p -> System.out.println(p));
		
		System.out.println("After solution 3");
		//Lamda
		Collections.sort(people, (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge())
		);
		people.forEach(p->System.out.println(p));
		
		System.out.println("After solution 4");*/
		
		Collections.sort(people, this::compareAges);
		
		people.forEach(p -> System.out.println(p) );
	}
	
	public int compareAges(Person p1, Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}

}
