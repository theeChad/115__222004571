import java.util.Scanner;

public class nbrrev_dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        do {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        } while (number != 0);

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
