package session4;

import java.util.Scanner;

public class ProperDivisionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int targetNumber = scanner.nextInt();
        System.out.printf("Proper divisors for '%s' : \n", targetNumber);
        findDivisors(targetNumber);

    }
    private static void findDivisors(int targetNumber) {
        for (int i = 1; i < targetNumber / 2; i++) {
            if (targetNumber % i == 0) {
                System.out.println(i + " ");
            }

        }
    }
}

