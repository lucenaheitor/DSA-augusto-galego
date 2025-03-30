package arrays;


public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        int result = binarySearch(b, 3);


    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int steps = 0;
        while (left <= right) {
            steps +=1;
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                System.out.println("steps: " + steps);
                return middle;
            }
            if (array[middle] < target) {

                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}