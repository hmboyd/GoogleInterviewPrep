package arrays;

public class MaxProductSubArray {
    public static void main(String[] args){

    }

    public static int getMaxProductSubArray(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int max_ending = nums[0];
        int min_ending = nums[0];
        int max_so_far = nums[0];

        for(int i = 1;i<nums.length;i++){
            int temp = max_ending;

            max_ending = Integer.max(nums[i], Integer.max(nums[i] * max_ending,
                    nums[i] * min_ending));

            min_ending = Integer.min(nums[i], Integer.min(nums[i] * temp,
                    nums[i] * min_ending));

            max_so_far = Integer.max(max_so_far, max_ending);
        }
        return max_so_far;
    }
}
