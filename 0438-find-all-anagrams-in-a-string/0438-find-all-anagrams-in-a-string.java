class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() < p.length()){
            return result;
        }
        int[] counts = new int[26];
        for (char c : p.toCharArray()) {
            counts[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        int res = p.length(); 
        while (right < s.length()) {
            if (counts[s.charAt(right) - 'a'] > 0) {
                res--;
            }
            counts[s.charAt(right) - 'a']--;
            right++;
            if (res == 0) {
                result.add(left);
            }
            if (right - left == p.length()) {
                if (counts[s.charAt(left) - 'a'] >= 0) {
                    res++;
                }
                counts[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return result;
    }
}
