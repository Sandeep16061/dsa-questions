//easy (5-10) min
// https://leetcode.com/problems/contains-duplicate/description/
import java.util.*;
public class Contains_Duplicate {
    public static boolean C_Duplicate(int nums []){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums [] ={1,2,3,1};
        boolean ans=C_Duplicate(nums);
        System.out.println(ans);


    }
}
