package com.ivprep;

import java.util.Arrays;

public class Example_03 {
//Count Words in a String Using Java 8 Stream API 
	public static void main(String[] args) {
		 
		String str="i am learning java";
		
		long count=Arrays.stream(str.split("\\s+")).count();
		
		/* long wordCount = Arrays.stream(str.split("\\s+")) // Splits on one or more whitespace characters
                .filter(word -> !word.isEmpty()) // Filters out any empty strings (e.g., from multiple spaces)
                .count(); // Counts the number of elements in the stream
                
                */
		System.out.println(count);
	}

}
