package arrays;

public class ConvertArrayToBST {
    public static void main(String[] args){

    }

    public static Node convertToBST(int[] arr, int start, int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        Node node = new Node(arr[mid]);
        node.left = convertToBST(arr, start, mid-1);
        node.right = convertToBST(arr, mid+1, end);
        return node;
    }
}
