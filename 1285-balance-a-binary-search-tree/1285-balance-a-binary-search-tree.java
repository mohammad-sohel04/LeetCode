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
  ArrayList<Integer>list;
    public TreeNode balanceBST(TreeNode root) {
        list=new ArrayList<>();
        helper(root);
        System.out.print(list);
        return maker(0,list.size()-1);
        //return root;

    }
    TreeNode maker(int left,int right){
      if(left>right)return null;
      //while(left<right){
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=maker(left,mid-1);
        root.right=maker(mid+1,right);        
      return root;
    }
    void helper(TreeNode root){
      if(root==null)return;
      helper(root.left);
      list.add(root.val);
      helper(root.right);
    }
}