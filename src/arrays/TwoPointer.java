package arrays;

public class TwoPointer {
    public static void main(String[] args) {

        String originalString = "Exemplo de string";
        char[] charArray = originalString.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

        String reversedString = new String(charArray);
        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reversedString);

    }
}
