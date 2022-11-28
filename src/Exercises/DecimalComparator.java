package Exercises;
//ex5
public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one = one < 0 ? Math.ceil(one * 1000) : Math.floor(one * 1000);
        two = two < 0 ? Math.ceil(two * 1000) : Math.floor(two * 1000);


        return one == two;

    }

}