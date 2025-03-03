package arrays;

import java.util.HashMap;

public class HashMapProblem {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Conta a frequência de cada caractere
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Encontra o primeiro caractere único
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;  // Se não houver caracteres únicos
    }

    public static void main(String[] args) {
//        System.out.println(firstUniqChar("leetcode"));      // Saída: 0
//        System.out.println(firstUniqChar("loveleetcode"));  // Saída: 2
//        System.out.println(firstUniqChar("aabb"));          // Saída: -1
    }
}
