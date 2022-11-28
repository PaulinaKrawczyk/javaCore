package session5;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println("Number of  Vowels in the string: " + countVowels(str));
    }

    private static int countVowels(String input) {
        int vowelsCount = 0;
        String vowels = "aioyue";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(String.valueOf(input.charAt(i)))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    private static int countConsonants(String input) {
        return input.length() - countVowels(input);
    }
}
