class Solution { 
    public int[] dailyTemperatures(int[] arr) { 
        Stack<Integer> st = new Stack<>(); 
        int[] res = new int[arr.length];     
        for (int index = arr.length - 1; index >= 0; index--) { 
            while (!st.isEmpty() && arr[st.peek()] <= arr[index]) { 
                st.pop(); 
            } 
            res[index] = (st.isEmpty()) ? 0 : st.peek() - index;    
            st.push(index); 
        } 
        return res; 
    } 
}