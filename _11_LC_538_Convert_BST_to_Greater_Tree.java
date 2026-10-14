import java.util.*;
public class _11_LC_538_Convert_BST_to_Greater_Tree {



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
      
        // Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
     
        TreeNode root=new TreeNode(4); // root Node
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(0);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(7);
        b.left=e;
        b.right=f;

        TreeNode g=new TreeNode(3);
        d.right=g;
        
        TreeNode h=new TreeNode(8);
        f.right=h;


        greaterTree(root);  // Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]

    }

     static int sum=0;

    public static void greaterTree(TreeNode root){
       if(root==null) return ;

       greaterTree(root.right);

        root.val= root.val + sum;
        sum=root.val;


       greaterTree(root.left);
       

    }
}
