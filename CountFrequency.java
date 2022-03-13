package arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class CountFrequency {
    public static void main(String[] args){
        int[] nums = {10, 20, 20, 10, 10, 20, 5, 20};

        printFrequency(nums);
    }

    public static void printFrequency(int[] nums){
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i  : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
