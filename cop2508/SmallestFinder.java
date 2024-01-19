package cop2508;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a number:");

		double n = input.nextDouble(); // Read user input

		getFactor(n);
		System.out.println("\nList of Factors:\n" + getFactor(n) + "\n");
		getSmallest(n);
		;

	}

	private static double getSmallest(double n) {

		List<Double> factors = new ArrayList<>();

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				factors.add((double) i);

				n = n / i;
			}

		}
		System.out.println("List of Smallest Factors:\n" + factors);
		return n;

	}

	private static List<Double> getFactor(double n) {

		List<Double> numbers = new ArrayList<>();

		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				numbers.add((double) i);
			}
		}

		return numbers;
	}
}
