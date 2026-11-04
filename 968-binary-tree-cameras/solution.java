// 0 ms | 44.1 MB
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    int cameras = 0;

    public int minCameraCover(TreeNode root) {

        if (dfs(root) == 0) {
            cameras++;
        }

        return cameras;
    }

    // 0 = Not covered
    // 1 = Has camera
    // 2 = Covered

    int dfs(TreeNode root) {

        // Null node is considered covered
        if (root == null) {
            return 2;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        // If any child is not covered
        if (left == 0 || right == 0) {

            cameras++;

            return 1;
        }

        // If any child has a camera
        if (left == 1 || right == 1) {
            return 2;
        }

        // Both children are covered
        return 0;
    }
}
