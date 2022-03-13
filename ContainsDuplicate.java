package arrays;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums =  {1,2,3,4,4};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
