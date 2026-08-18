class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int totalCount = 10;
        int currentUniqueDigits = 9;
        int availableChoices = 9;
        n = Math.min(n, 10);
        for (int i = 2; i <= n; i++) {
            currentUniqueDigits = currentUniqueDigits * availableChoices;
            totalCount += currentUniqueDigits;
            availableChoices--; 
        }
        return totalCount;
    }
}