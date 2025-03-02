import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        int target = 3;

        linearSearch(arr, target);
    }

    public static void linearSearch(List<Integer> arr, int target) {
        for (int i = 0; i <= arr.size(); i++) {
            if (arr.get(i) == target) {
                System.out.println(arr.get(i));
                return;
            }
        }

    }
}
