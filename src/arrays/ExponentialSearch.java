package arrays;

import java.util.ArrayList;
import java.util.List;

import static arrays.BinarySearch.binarySearch;

public class ExponentialSearch {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        int target = 7;


    }
    public  Integer exponentialSearch(List<Integer> arr , Integer target){
        if(arr.get(0) == target){
            return 0;
        }

        Integer n = arr.size();

        int right = 1;

        while (right < n && arr.get(right) < target) {
            right *= 2;

            if(arr.get(right) == target){
                return right;
            }
            //binarySearch(arr.get(right), target);

        }

        return arr.get(right);

    }
}
