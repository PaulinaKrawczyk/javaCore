package session4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPlayground {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        int[] randomNumber = { 2,4,7,1,10,5,67};
        Arrays.sort(randomNumber);
        System.out.println(Arrays.toString(randomNumber));
        int numberToSearch = 8;
        System.out.printf("Index of %s in out SORTED is %s",numberToSearch,Arrays.binarySearch(randomNumber,numberToSearch));
        int[] newNumber = Arrays.copyOf(randomNumber,20);
        System.out.println();
        System.out.println(Arrays.toString(newNumber));
        Arrays.fill(newNumber,8,newNumber.length,100);
        System.out.println(Arrays.toString(newNumber));

    }

}
