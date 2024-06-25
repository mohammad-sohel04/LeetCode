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
//  class Solution {
//   List<Integer>list;
//     public TreeNode bstToGst(TreeNode root) {
//         list=new ArrayList<>();
//         helper(root);
        
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int pre=0;
//         for(int i=list.size()-1;i>=0;i--){
//           map.put(list.get(i),list.get(i)+pre);
//           pre=list.get(i)+pre;
//         }
//         //System.out.print(map);
//         helper2(root,map);

//         return root;
//     }
//     void helper(TreeNode root){
//       if(root==null)return;
      
//       helper(root.left);
//       list.add(root.val);
//       helper(root.right);
      
//     }
//     void helper2(TreeNode root,Map<Integer,Integer>map){
//       if(root==null)return;
//       root.val=map.get(root.val);
//       helper2(root.left,map);
//       helper2(root.right,map);
//     }
// }
class Solution {
    int pre;
    public TreeNode bstToGst(TreeNode root) {
        pre=0;
        helper(root);
        return root;
    }
    void helper(TreeNode root){
      if(root==null)return;
      helper(root.right);
     root.val=pre+root.val;
     pre=root.val;
      helper(root.left);
      
    }
}