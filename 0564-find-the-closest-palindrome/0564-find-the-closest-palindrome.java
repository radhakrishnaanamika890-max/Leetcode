import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        int len = n.length();
        List<Long> candidates = new ArrayList<>();

        // Edge cases: 10^(len-1) - 1 and 10^len + 1
        candidates.add((long) Math.pow(10, len - 1) - 1);
        candidates.add((long) Math.pow(10, len) + 1);

        // Get the prefix (first half of the string)
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));

        // Generate palindromes by modifying the prefix
        for (long i = -1; i <= 15; i++) { // covering prefix - 1, prefix, prefix + 1
            if (i == -1 || i == 0 || i == 1) {
                String pStr = String.valueOf(prefix + i);
                StringBuilder sb = new StringBuilder(pStr);
                
                // If length is odd, reverse everything except the last char of the prefix
                if (len % 2 == 0) {
                    sb.append(new StringBuilder(pStr).reverse());
                } else {
                    sb.append(new StringBuilder(pStr.substring(0, pStr.length() - 1)).reverse());
                }
                candidates.add(Long.parseLong(sb.toString()));
            }
        }

        // Remove the original number itself from candidates
        candidates.remove(Long.valueOf(num));

        // Find the closest palindrome
        long closest = -1;
        for (long cand : candidates) {
            if (closest == -1) {
                closest = cand;
            } else if (Math.abs(cand - num) < Math.abs(closest - num)) {
                closest = cand;
            } else if (Math.abs(cand - num) == Math.abs(closest - num)) {
                closest = Math.min(closest, cand);
            }
        }

        return String.valueOf(closest);
    }
}
