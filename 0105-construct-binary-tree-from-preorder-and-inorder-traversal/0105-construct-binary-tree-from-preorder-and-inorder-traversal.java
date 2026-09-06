class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        while (inorder[i] != preorder[0]) {
            i++;
        }
        int[] leftInorder = new int[i];
        for (int j = 0; j < i; j++) {
            leftInorder[j] = inorder[j];
        }
        int[] rightInorder = new int[inorder.length - i - 1];
        for (int j = i + 1; j < inorder.length; j++) {
            rightInorder[j - i - 1] = inorder[j];
        }
        int[] leftPreorder = new int[i];
        for (int j = 0; j < i; j++) {
            leftPreorder[j] = preorder[j + 1];
        }
        int[] rightPreorder = new int[preorder.length - i - 1];
        for (int j = i + 1; j < preorder.length; j++) {
            rightPreorder[j - i - 1] = preorder[j];
        }
        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);
        return root;
    }
}