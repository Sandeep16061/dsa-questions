import java.util.PriorityQueue;

public class kth_largest_element {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);

        nums = new int[]{3, 2, 3, 1, 4, 2};
        k = 3;
        result = findKthLargest(nums, k);
        System.out.println("The " + k + "rd largest element is: " + result);
    }
}
