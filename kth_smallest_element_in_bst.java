class Solution {
    int count = 0 ;
    int ans = 0 ;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans ;
    }

    public void helper(TreeNode root , int k){
        if(root == null){
            return;
        }

        helper(root.left , k);
        count = count +1 ;
        if(count == k){
            ans = root.val;
        }
        helper(root.right,k);
    }
}