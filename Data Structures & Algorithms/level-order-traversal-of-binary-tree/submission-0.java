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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        List<Integer> rootval = new ArrayList<>();
        rootval.add(root.val);
        res.add(rootval);
        
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int n = nodes.size();
            for(int i = 0; i < n; i++){
                TreeNode curr = nodes.poll();
                if(curr.left != null){
                    row.add(curr.left.val);
                    nodes.add(curr.left);
                }
                if(curr.right != null){
                    row.add(curr.right.val);
                    nodes.add(curr.right);
                }
            }
            if(row.size() > 0) res.add(row);
        }

        return res;
    }
}
