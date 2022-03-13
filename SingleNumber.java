package arrays;

public class SingleNumber {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        System.out.println(getSingleNumber(arr));
    }

    public static int getSingleNumber(int[] nums){
        int result = nums[0];
        for(int i = 1;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
