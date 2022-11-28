package Exercises;
//ex6
public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
    }
    public static boolean hasEqualSum (int one, int two, int three){
        return one + two == three;
    }

}
