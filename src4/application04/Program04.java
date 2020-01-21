package application04;

import java.util.Locale;
import java.util.Scanner;

import entities04.Student;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the student name and score.");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("1º Score: ");
		student.score1 = sc.nextDouble();
		System.out.print("2º Score: ");
		student.score2 = sc.nextDouble();
		System.out.print("3º Score: ");
		student.score3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("Failed!");
			System.out.printf("Missing %.2f Points%n", student.missingPoints());
		} else {
			System.out.println("Pass!");
		}

		sc.close();

	}

}
