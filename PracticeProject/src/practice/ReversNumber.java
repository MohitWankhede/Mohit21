package practice;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;
		System.out.println("Number = " + num);
		while(num>0) {
			int rem = num%10;//reminder value 123/10 =3, 12/10=2, 1/10=
		    rev = rev*10 + rem;//0*10+3=3, 3*10+2, 
			num = num/10;//123/10=12, 12/10=1, 
		}
		num=rev;
		System.out.println("Revers Number = " + num);
}
}
