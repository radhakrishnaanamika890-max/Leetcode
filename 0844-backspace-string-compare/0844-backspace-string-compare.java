class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = buildString(s);
        String t1 = buildString(t);
        return s1.equals(t1);
    }
    private String buildString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}