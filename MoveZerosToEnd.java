package arrays;

import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,0,6,7,8,9};

        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros(int[] nums){
        for(int lastNonZeroIndex =0, current = 0; current<nums.length; current++){
            if(nums[current]!=0){
                swap(nums, lastNonZeroIndex, current);
                lastNonZeroIndex++;
            }
        }
    }

    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
