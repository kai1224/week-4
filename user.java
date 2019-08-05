package lastday;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scnr = new Scanner(System.in);
		String name = "";
		String color= "";
		int age = 2;
		
		
		
		System.out.println("welcome");
		
		System.out.println("enter your name ");
		name = scnr.next();
		
		System.out.println("what's your favorite color?");
		color = scnr.next();
		
		System.out.println("how old are you?");
		age = scnr.nextInt();
		
		System.out.println("My name is " + name );
		System.out.println("My favorite color is " + color);
		System.out.println("My age is " + age );
		
		System.out.println("watch this magic trick");
		
		for(int i = 1; i < 1000 ; i *= 2 ) {
			System.out.println(i);
		}
		
		System.out.println("Here's our while loop.....");
		
		
		System.out.println("Flipped loop");
		int k = 5;
		System.out.println("flipped loop");
		int d = 15;
		
		while (d > 5) {
			k++;
			d--;
		}
		System.out.println(k);
		System.out.println(d);
		
		
		
		
		
		
	}

}
