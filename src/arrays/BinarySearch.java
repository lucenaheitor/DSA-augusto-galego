package arrays;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Elemento não presente no array.");
        } else {
            System.out.println("Elemento encontrado no índice: " + result);


        }

    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Verifica se o target está no meio
            if (array[middle] == target) {
                return middle;
            }

            // Se o target for maior, ignore a metade esquerda
            if (array[middle] < target) {
                left = middle + 1;
            } else {
                // Se o target for menor, ignore a metade direita
                right = middle - 1;
            }
        }
        return -1;
    }
}