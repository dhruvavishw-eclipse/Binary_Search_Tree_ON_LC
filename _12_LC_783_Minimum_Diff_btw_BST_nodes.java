import java.util.*;
public class _12_LC_783_Minimum_Diff_btw_BST_nodes {

     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

     static int minDiff = Integer.MAX_VALUE;
    static TreeNode prev = null;

    public static void main(String RCB []){
        // Input: root = [1,0,48,null,null,12,49]
      TreeNode root= new TreeNode(1);
      TreeNode a=new TreeNode(0);
      TreeNode b=new TreeNode(48);
      root.left=a;
      root.right=b;

      TreeNode c=new TreeNode(12);
      TreeNode d=new TreeNode(49);
      b.left=c;
      b.right=d;


        System.out.println(minDiffInBST(root));
    }

    
    public static int minDiffInBST(TreeNode root) {
       minDiff = Integer.MAX_VALUE;
       prev = null;

      inorder(root);
      return minDiff;
    }

    
    static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            int diff=Math.abs(root.val-prev.val);
            minDiff=Math.min(diff,minDiff);
        }
            prev=root;
        inorder(root.right);
    }


}
