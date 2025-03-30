package arrays;

public class binaryTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 12;
        int result = binarySearchLearn(array, target);

        if(result == -1){
            System.out.println("No binary search");
        }else {
            System.out.println("Elemento encontrado no índice: " + result);
        }


    }

    public static int binarySearchLearn(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low  <= high){
            int mid = low + (high - low) /2;

            if (array[mid] == target){
                return mid;
            }
            if(array[mid] < target){
                high= mid +1 ;
            }else{
                low = mid - 1 ;
            }
        }
        return -1;
    }
}
