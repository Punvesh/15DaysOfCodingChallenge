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
    public int minDepth(TreeNode root) {
        // Base case: if root is null, depth is 0
        if (root == null) {
            return 0;
        }
        
        // If it's a leaf node, return 1
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        // If left child is null, recurse on right subtree
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        
        // If right child is null, recurse on left subtree
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        // Both children exist, take minimum of both subtrees
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}