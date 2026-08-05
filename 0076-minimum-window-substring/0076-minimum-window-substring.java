import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0, right = 0, count = map.size(), minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            char r = s.charAt(right++);
            if (map.containsKey(r)) {
                map.put(r, map.get(r) - 1);
                if (map.get(r) == 0) count--;
            }

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char l = s.charAt(left++);
                if (map.containsKey(l)) {
                    if (map.get(l) == 0) count++;
                    map.put(l, map.get(l) + 1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
