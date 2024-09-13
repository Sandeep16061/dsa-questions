//easy 5-10 min
//https://www.geeksforgeeks.org/program-to-reverse-an-array/
import java.util.*;
public class Reverse_Array{
    public static void main(String args[]){
        int arr[]= {4, 5, 1, 2};
        int R_Array[]= new int [arr.length];
        for(int i=0;i<arr.length;i++){
            R_Array[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(R_Array));

    }
}