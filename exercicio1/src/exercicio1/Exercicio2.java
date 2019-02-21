package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine(); // Alex Green
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt(); // 3
		System.out.println("Enter your product price:");
		double price = sc.nextDouble(); // 500.50
		System.out.println("Enter your last name, age and height (same line):");
		// Green 21 1.73
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		
	sc.close();	
	}

}
