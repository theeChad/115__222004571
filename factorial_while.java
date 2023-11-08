import java.util.Scanner;

public class factorial_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}
