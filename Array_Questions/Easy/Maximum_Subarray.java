//easy 5-10 min
//https://leetcode.com/problems/maximum-subarray/description/

public class Maximum_Subarray {
    public static void main(String[] args) {
        int pre = 0;
        int max = Integer.MIN_VALUE;
        int Arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        for (int i = 0; i < Arr.length; i++) {
            pre = Math.max(Arr[i], pre + Arr[i]);
            max = Math.max(pre, max);
        }
        System.out.println(max);

    }
}
