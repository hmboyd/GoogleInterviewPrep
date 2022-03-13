package arrays;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] nums = {-8, -3, -6, -2, -5, -4};

        System.out.println(getMaximumSubArraySum(nums));
    }

    public static int getMaximumSubArraySum(int[] nums){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for(int i : nums){
            maxEndingHere += i;
            maxEndingHere = Math.max(maxEndingHere, i);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
