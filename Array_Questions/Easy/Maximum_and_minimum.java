//easy 5-10 min
//(https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/)
import java.util.*;

public class Maximum_and_minimum {
    public static void main(String args[]) {
        int Arr[] = { 3, 5, 4, 1, 9 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            }
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.println("The min :" + min);
        System.out.println("The Max :" + max);
    }
}