package com.juan.salinas.api.streams03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Sorting strings
 * Task: An array of string is given. Sort the strings in lexicographic order
 *
 */
public class App {

	public static void main(String[] args) {
		
		String[] AS = {
			"abcd", "bcfk", "def", "jklmn", "jprst", "afc", "ambn", "kmk", "qrbd", "jus"	
		};
		
		List<String> words = new ArrayList<>();
		
		for(int i = 0; i<AS.length; i++) {
			words.add(AS[i]);
		}
		
		Stream<String> stream = words.stream();
		Stream<String> streamSorted = stream.sorted();
		
		Consumer<String> action = (str) -> {
			System.out.println(str);
		};
		
		streamSorted.forEach(action);
		
		// Sort stream elements in descending order
		
		Comparator<String> comparator = (str1, str2) -> {
			return str2.compareTo(str1);
		};
		
		stream = words.stream();
		Stream<String> streamSortedDesc = stream.sorted(comparator);
		System.out.println("Stream descending order");
		streamSortedDesc.forEach(action);
		
	}
	
}
