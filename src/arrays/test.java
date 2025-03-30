package arrays;

public class test {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch2(array, target);

        System.out.println(result);
    }

    public static int binarySearch2(int[] array, int target){
        int left = 0;
        int rightt = array.length - 1;

        while (left <= rightt){
            int mid = left +(rightt - left) / 2;

            if( array[mid] == target){
                return mid;
            }
            if( array[mid] < target){
                 rightt = mid  + 1;
            }else {
                 left =  mid - 1 ;
            }
        }
        return  - 1;
    }
}
