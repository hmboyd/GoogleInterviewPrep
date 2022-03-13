package arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {1,1,1,2};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] array){
        int j = 1;
        int previous = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] == previous)
                continue;
            array[j++] = array[i];
            previous = array[i];
        }

        return j;
    }
}
