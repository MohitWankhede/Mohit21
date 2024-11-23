package Mohit.mohit_01;

import java.util.HashSet;
import java.util.Set;

public class heLeftoverStringllo {


	    public static String removeCharacters(String A, String B) {
	        // Convert B to a set of characters for quick lookup
	        Set<Character> setB = new HashSet<>();
	        for (char ch : B.toCharArray()) {
	            setB.add(ch);
	        }

	        // Build the result by including characters from A not found in setB
	        StringBuilder result = new StringBuilder();
	        for (char ch : A.toCharArray()) {
	            if (!setB.contains(ch)) {
	                result.append(ch);
	            }
	        }

	        // Return "Empty" if result is empty, otherwise return the result
	        return result.length() > 0 ? result.toString() : "Empty";
	    }

	    public static void main(String[] args) {
	        String A = "AABBCC";
	        String B = "AB";
	        System.out.println(removeCharacters(A, B)); // Output should be "CC"
	    }
	}


