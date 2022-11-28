package session4;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int targetNumber = scanner.nextInt();
        System.out.printf("Perfect numbers for '%s' : \n", targetNumber);
        printPerfectNums(targetNumber);

    }
    private static void printPerfectNums(int targetNumber) {
        for (int i = 2; i < targetNumber; i++) {
            if (isNumberPerfect(i))
                System.out.print(i + " ");
        }
    }

    private static boolean isNumberPerfect(int potentiallyPerfect) {
        int sumOfDivisors = 1;
        for (int i = 2 ; i <= potentiallyPerfect / 2; i++) {
            if (potentiallyPerfect % i == 0){
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == potentiallyPerfect;
    }
}
