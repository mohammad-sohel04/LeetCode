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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer>set=new HashSet<>();
        List<TreeNode>list=new ArrayList<>();
        for(int x:to_delete)set.add(x);
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
          TreeNode cur=q.poll();
          TreeNode l=cur.left;
          TreeNode r=cur.right;
          if(l!=null){
            q.add(l);
            if(set.contains(l.val))cur.left=null;
          }
          if(r!=null){
            q.add(r);
            if(set.contains(r.val))cur.right=null;
          }
          if(set.contains(cur.val)){
            if(cur.left!=null)list.add(cur.left);
            if(cur.right!=null)list.add(cur.right);
          }
          else if(list.isEmpty()) {
            list.add(cur);
         }
        }
        return list;
    }
}