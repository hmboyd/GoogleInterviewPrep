package arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] nums = {8,9,9};

        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] nums){
        if(nums == null || nums.length == 0){
            return nums;
        }

        int carry = 1;
        int i;
        for(i = nums.length-1;i>=0;i--){
            if(nums[i] == 9){
                nums[i] = 0;
            }
            else{
                carry += nums[i];
                nums[i] = carry;
                break;
            }
        }
        if(i<0){
            int[] result = new int[nums.length+1];
            result[0] = 1;
            return result;
        } else{
            return nums;
        }
    }
}
