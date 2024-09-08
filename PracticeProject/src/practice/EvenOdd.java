package practice;

import java.util.Scanner;

public class EvenOdd {

public static void main(String[] args) {
		
		System.out.println("Enter Number and check number is odd or Even");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}
