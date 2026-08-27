class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        for (String token : tokens) {
            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                int b = stack[top--];
                int a = stack[top--];

                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                }
                else if (token.equals("-")) {
                    result = a - b;
                }
                else if (token.equals("*")) {
                    result = a * b;
                }
                else {
                    result = a / b;
                }

                stack[++top] = result;

            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }
        return stack[top];
    }
}