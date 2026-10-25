import java.util.*;
public class _15_LC_669_Trim_a_BST {
    
     
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


    public static void main(String RCB []){
     // Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
       
     TreeNode root=new TreeNode(3);
     TreeNode a=new TreeNode(0);
     TreeNode b=new TreeNode(4);
     root.left=a;
     root.right=b;

      TreeNode c=new TreeNode(2);
      a.right=c;

       TreeNode d=new TreeNode(1);
       c.left=d;

       int low=1;
       int high=3;


       System.out.println(trimBST(root, low, high)); // Output: [3,2,null,1]

    }


    public static TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode infinite =new TreeNode(Integer.MAX_VALUE);
        infinite.left=root;

        trim(infinite,low,high);
         return infinite.left;
    }

    public static void trim(TreeNode root, int low, int high){
       if(root==null) return;

       while(root.left!=null){
         if(root.left.val<low) root.left = root.left.right;
         else if(root.left.val>high) root.left = root.left.left;
         else break;
       }

      
      while(root.right!=null){
        if(root.right.val<low) root.right= root.right.right;
        else if(root.right.val>high) root.right=root.right.left;
        else break;
      }

      trim(root.left,low,high);
      trim(root.right,low,high);

    }

}
