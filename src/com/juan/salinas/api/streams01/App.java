package com.juan.salinas.api.streams01;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 
 * Determining the number of even numbers in the data stream
 * Task: For any set of randomly generated numbers, you need to determine the number of paired ones. 
 *
 */
public class App {

	public static void main(String[] args) {
		
		// 1. Create data stream from random array of numbers
		
		ArrayList<Integer> numbers = new ArrayList<>();
		int number;
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			number = random.nextInt() % 100;
			numbers.add(number);
		}
		
		System.out.println("Numbers: " + numbers);
		
		// 2.  Determinate the number of paired numbers
		// 2.1 Create stream from 'numbers' 
		Stream<Integer> st = numbers.stream();
		
		// 2.2 Declare a reference to Predicate<Integer>
		Predicate<Integer> fn;
		
		// 2.3 Assign a lambda expression to the reference that determines if the number is even
		fn = (n) -> ( n%2 ) == 0;
		
		// 2.4 Call the filter() method, wich selects only pairs of numbers from the stream st
		Stream<Integer> resStream = st.filter(fn);
		
		System.out.println("Pairs: ");
		
		resStream.forEach(n -> {
			System.out.println(n);
		});
		
	}
}
