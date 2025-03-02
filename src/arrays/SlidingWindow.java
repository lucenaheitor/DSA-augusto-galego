package arrays;

import java.util.HashMap;

public class SlidingWindow {
    public static void main(String[] args) {
        SlidingWindow solution = new SlidingWindow();
        String s = "abcabcabc";
        System.out.println(solution.maximumLengthSubstring(s));
    }

    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0;
        int _max = 1;
        HashMap<Character, Integer> counter = new HashMap<>();

        counter.put(s.charAt(0), 1);

        while (r < s.length() - 1) {
            r++;
            counter.put(s.charAt(r), counter.getOrDefault(s.charAt(r), 0) + 1);

            while (counter.get(s.charAt(r)) == 3) {
                counter.put(s.charAt(l), counter.get(s.charAt(l)) - 1);
                l++;
            }
            _max = Math.max(_max, r - l + 1);
        }

        return _max;
    }
}
