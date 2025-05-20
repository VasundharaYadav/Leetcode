class Solution {
    int ans = 0 ;
    public int height(TreeNode root ){
        if(root == null){
            return 0 ;
        }
        int lh = height(root.left );
        int rh = height(root.right);
        return Math.max(lh,rh) +1 ;
    }
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        helper(root , h);
        return ans ;
    }

    public void helper(TreeNode root , int height ){
        if(root == null){
            return ;
        }
        if(height == 1){
            ans = ans + root.val;
        }
        helper(root.left , height-1);
        helper(root.right , height-1);
    }
}