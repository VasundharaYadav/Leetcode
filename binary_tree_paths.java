class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }else if ( root.left == null && root.right == null){
            ans.add("" + root.val);
            return ans ;
        }

        List<String> leftAns = binaryTreePaths( root.left ) ;
         List<String> rightAns = binaryTreePaths( root.right ) ;

         for(String str : leftAns){
             ans.add(root.val + "->" + str);
         }
          for(String str : rightAns){
             ans.add(root.val + "->" + str);
         }

         return ans ;
    }
}ss