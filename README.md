Smallest Factor Finder

The SmallestFinder Java program takes a user-inputted number, finds its factors, and then identifies the smallest prime factors. It utilizes methods to achieve modularity and readability.
Features

    Main Method:
        Takes user input for a number.
        Calls methods to find factors and smallest factors.
        Displays the list of factors and smallest factors.

java

public static void main(String[] args)

    Get Smallest Method:
        Finds the smallest prime factors of the input number.
        Prints the list of smallest factors.

java

private static double getSmallest(double n)

    Get Factor Method:
        Finds the factors of the input number.
        Returns a list of factors.

java

private static List<Double> getFactor(double n)

    Scanner Object:
        Uses Scanner to take user input.

java

Scanner input = new Scanner(System.in);

Usage

    Clone the repository:

    bash

    git clone https://github.com/yourusername/SmallestFactorFinder.git

    Open the project in your preferred Java development environment.

    Run the SmallestFinder class.

    Enter a number when prompted.

    View the output in the console, which will display the list of factors and smallest factors.

Example

java

public class SmallestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        double n = input.nextDouble();

        getFactor(n);
        System.out.println("\nList of Factors:\n" + getFactor(n) + "\n");
        getSmallest(n);
    }
    // ... (rest of the code)
}


Feel free to customize this README based on your project's specific details and preferences. Add more sections or details as needed.

