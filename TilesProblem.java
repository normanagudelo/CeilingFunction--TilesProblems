import java.util.Scanner;  // Import the Scanner class from the java.util package to read user input

public class Main {  // Define the Main class

    // Method to perform division with rounding up
    public static int ceilDivide(int a, int b) {
        return (a + b - 1) / b;  // Returns the result of division with rounding up
    }

    // Method to calculate the minimum number of tiles needed
    public static int minTiles(int X, int N, int M) {
        return ceilDivide(N, X) * ceilDivide(M, X);  // Returns the product of divisions of N and M by X
    }

    public static void main(String[] args) {  // Main method
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read user input from the console

        // Input of values X, N, and M
        int X = scanner.nextInt();  // Read the value of X
        int N = scanner.nextInt();  // Read the value of N
        int M = scanner.nextInt();  // Read the value of M

        // Calculate and display the minimum number of tiles
        System.out.println(minTiles(X, N, M));  // Call the minTiles method and display the result

        scanner.close();  // Close the Scanner to release resources
    }
}

