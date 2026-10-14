import java.util.*;
public class _10_LC_1008 {

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

        int [] preorder = {8,5,1,7,10,12};

        System.out.println(bstFromPreorder(preorder));
       
    }


    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode (preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root=insertIntoBST(root,preorder[i]);
        }

        return root;
    }

   public static TreeNode insertIntoBST(TreeNode root, int val) {
       if(root==null) return new TreeNode(val);

       if(val < root.val){
         root.left=insertIntoBST(root.left,val);
       } 

       else {
        root.right=insertIntoBST(root.right,val);
       }

       return root;

    }

}
