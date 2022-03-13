package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MedianTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = new int[arr1.length + arr2.length];

        mergeArraysUsingTreeMap(arr1, arr2, arr3);

        System.out.print(Arrays.toString(arr3));
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3){
        int i =0, j=0, k=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            } else{
                arr3[k++] = arr2[j++];
            }
        }

        while(i<n1){
            arr3[k++] = arr1[i++];
        }

        while(j<n2){
            arr3[k++] = arr2[j++];
        }
    }

    public static void mergeArraysUsingTreeMap(int[] arr1, int[] arr2, int[] arr3){
        Map<Integer,Boolean> map = new TreeMap<Integer,Boolean>();

        for(int i = 0;i<arr1.length;i++){
            map.put(arr1[i], true);
        }

        for(int j = 0;j<arr2.length;j++){
            map.put(arr2[j], true);
        }
        int k = 0;
        for(Map.Entry<Integer,Boolean> entry : map.entrySet()){
            arr3[k++] = entry.getKey();
        }
    }


}
