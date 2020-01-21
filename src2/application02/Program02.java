package application02;

import java.util.Locale;
import java.util.Scanner;

import entities02.Rectangle;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(rectangle);
		
		
		sc.close();

	}

}
