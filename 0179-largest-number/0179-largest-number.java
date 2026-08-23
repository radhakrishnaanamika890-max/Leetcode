import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        // Convert integer array to String array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort using a custom comparator
        // If (b + a) > (a + b), b comes before a
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the highest number is '0', the result is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the final largest number string
        StringBuilder sb = new StringBuilder();
        for (String str : strNums) {
            sb.append(str);
        }

        return sb.toString();
    }
}
