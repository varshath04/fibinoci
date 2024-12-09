import java.util.Scanner;

public class Fibonaci {
    
    // Function to generate Fibonacci sequence up to n terms
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        
        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
        
        scanner.close();
    }
}

