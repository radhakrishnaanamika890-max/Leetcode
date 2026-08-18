class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, maxArea = 0, top = -1;
        int[] stack = new int[n + 1]; 
        
        for (int i = 0; i <= n; i++) {
            int currH = (i == n) ? 0 : heights[i];
            while (top >= 0 && currH < heights[stack[top]]) {
                int h = heights[stack[top--]];
                int w = (top == -1) ? i : i - stack[top] - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack[++top] = i;
        }
        return maxArea;
    }
}
