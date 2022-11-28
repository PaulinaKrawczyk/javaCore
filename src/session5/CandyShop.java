package session5;

import java.util.Arrays;

public class CandyShop {
    /*
  Your goal is to calculate the largest number of candies the boss can buy with their available funds.
  Let’s consider a simpler example first. If the boss has 10 dollars to spend and the candy prices are
  [5, 2, 1, 3, 4], the array will first have to be sorted: [1, 2, 3, 4, 5]. Then we have to iterate
  through the elements of this array and verify when the available amount of money is going to be
  45 totally used. If we count the number of candies that can be purchased, there will be 4 items for this
  test case (1 + 2 + 3 + 4 = 10).
  */
    public static void main(String[] args) {
        int[] candyPrices = new int[]{3, 6, 25, 8, 3, 6, 9};
        int availableMoney = 10;
        bubbleSortPrices(candyPrices);
        System.out.printf("Sorted prices: %s \n", Arrays.toString(candyPrices));
        System.out.printf("Number of candies to bought having %s$ is %s \n",
                availableMoney, countCandies(candyPrices, availableMoney));
    }

    private static int countCandies(int[] candyPrices, int availableMoney) {
        int numberOfCandiesToBuy = 0;
        int moneyToSpent = availableMoney;
        for (int i = 0; i < candyPrices.length; i++) {
            if (moneyToSpent >= candyPrices[i]) {
                numberOfCandiesToBuy++;
                moneyToSpent -= candyPrices[i];
            }
        }
        return numberOfCandiesToBuy;
    }

    private static void bubbleSortPrices(int[] candyPrices) {
        for (int i = 0; i < candyPrices.length - 1; i++) {
            for (int j = 0; j < candyPrices.length - i - 1; j++) {
                if (candyPrices[j] > candyPrices[j + 1]) {
                    int temp = candyPrices[j];
                    candyPrices[j] = candyPrices[j + 1];
                    candyPrices[j + 1] = temp;
                }
            }
        }
    }
}
