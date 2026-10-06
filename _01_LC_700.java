import java.util.*;
public class _01_LC_700 {

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

    public static void main(String[] RCB) {
        
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(7);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;

        int target=2;
        

        System.out.println(searchBST(root, target));

      
    }

    public static TreeNode searchBST(TreeNode root, int target){
        if(root==null) return null;
        if(root.val==target) return root;
        else if(root.val>target) return searchBST(root.left, target);
        else return searchBST(root.right, target);
    }
}
