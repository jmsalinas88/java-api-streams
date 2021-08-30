package com.juan.salinas.api.streams02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Working with streams of strings. Search in a string
 * Task: Many names of employees are set. Develop a program that displays all surnames starting with the letter "J" 
 * 
 */
public class App {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alejandro", "Luis", "Carlos", "Jose", "Ursula", "Juan");
		
		System.out.println("Names: " + names);
		
		Predicate<String> fn;
		fn = (name) -> {
			if(name.charAt(0) == 'J') {
				return true;
			}else {
				return false;
			}
		};
		
		Stream<String> stream = names.stream();
		Stream<String> resStream = stream.filter(fn);
		
		System.out.println("Names: ");
		
		resStream.forEach(name -> {
			System.out.println(name);
		});
		
		
	}
	
}
