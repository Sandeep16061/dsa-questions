//easy 5-10 min
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
import java.util.*;
public class Chocolate_Distribution_Problem {
    public static int CSD(int arr[],int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++){
            int n= arr[i+m-1]-arr[i];
            min=Math.min(min, n);
        }
        return min;
    }
    public static void main(String args[]){
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        System.out.println(CSD(arr,m));
    }    
}
