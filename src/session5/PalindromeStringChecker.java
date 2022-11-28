package session5;

import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your palindrome string: ");
        String palindromeCandidate = scanner.next();
        System.out.printf("Is '%s' is palindrome - %s ", palindromeCandidate, isPalindrome(palindromeCandidate));
    }
    public static boolean isPalindrome(String palindromeCandidate) {
        String candidate = palindromeCandidate.toLowerCase();
        int lenght = palindromeCandidate.length();
        for (int i = 0; i < lenght / 2; i++) {
            if (candidate.charAt(i) != candidate.charAt(lenght - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
