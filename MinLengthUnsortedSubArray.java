package arrays;

public class MinLengthUnsortedSubArray {
    public static void main(String[] args){

    }

    public static int getMinLength(int[] nums){
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        int start = 1, end = 0;

        for(int i = 0, j = n-1;i<n;i++, j--){
            if(nums[i]<max){
                end = i;
            }
            if(nums[j]>min){
                start = j;
            }

            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return end-start+1;
    }
}
