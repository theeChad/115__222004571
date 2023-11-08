import java.util.Scanner;

public class sumnbr_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
            if (sum > limit) {
                System.out.println("Sum exceeded the limit. Stopping.");
                break;
            }
        }

        System.out.println("Sum of numbers before exceeding the limit: " + sum);
        scanner.close();
    }
}
