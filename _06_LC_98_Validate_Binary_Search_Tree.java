import java.util.*;
public class _06_LC_98_Validate_Binary_Search_Tree {

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

    static boolean flag=true;
    static TreeNode prev=null;

    public static void main(String RCB []){

        //Input: root = [5,1,4,null,null,3,6]
             
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(4);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(6);
        b.left=c;
        b.right=d;

        System.out.println(isValidBST(root)); // Output=false;

    }

	private static boolean isValidBST(TreeNode root) {
		// // TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'isValidBST'");

       flag=true;
       prev=null;

       inorder(root);
       return flag;

	}

	private static void inorder(TreeNode root) {
		// // TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'inorder'");

        if(root==null) return;
        inorder(root.left);

        if(prev==null) prev=root;
        else if(root.val<=prev.val) flag=false;
        else prev=root;

        inorder(root.right);

	}


}
