package arrays;

public class MaxSumNonAdjacentNumbers {
    public static void main(String[] args){
        int[] nums = {1, 2, 9, 4, 5, 0, 4, 11, 6};

        System.out.println(maximumSum(nums));
    }

    public static int maximumSum(int[] nums){
        if(nums ==  null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int prev_prev = nums[0];
        int prev = Integer.max(nums[0], nums[1]);

       for(int i = 2;i<nums.length;i++){
           int current = Integer.max(nums[i], Integer.max(prev, prev_prev+nums[i]));
           prev_prev = prev;
           prev = current;
       }
       return prev;
    }
}
