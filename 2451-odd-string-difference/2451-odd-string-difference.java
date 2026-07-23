import java.util.Arrays;

class Solution {
    public String oddString(String[] words) {

        int[] d1 = diff(words[0]);
        int[] d2 = diff(words[1]);
        int[] d3 = diff(words[2]);

        if (Arrays.equals(d1, d2)) {
            for (int i = 2; i < words.length; i++) {
                if (!Arrays.equals(d1, diff(words[i]))) {
                    return words[i];
                }
            }
            return words[0];
        }

        if (Arrays.equals(d1, d3)) {
            return words[1];
        }

        return words[0];
    }

    public int[] diff(String s) {
        int[] arr = new int[s.length() - 1];

        for (int i = 0; i < s.length() - 1; i++) {
            arr[i] = s.charAt(i + 1) - s.charAt(i);
        }

        return arr;
    }
}