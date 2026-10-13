import java.util.*;
public class _05_LC_235_LCA_Of_a_BST {


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

        // root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8

        TreeNode root=new TreeNode(6); // root Node
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(8);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(0);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(7);
        TreeNode f=new TreeNode(9);
        b.left=e;
        b.right=f;

        TreeNode g=new TreeNode(3);
        TreeNode h=new TreeNode(5);
        d.left=g;
        d.right=h;


        TreeNode p=new TreeNode(2);
        TreeNode q=new TreeNode(8);

        System.out.println(lowestCommonAncestor(root, p, q)); //Output: 6
        //Explanation: The LCA of nodes 2 and 8 is 6.

    }

    
   public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
    if(p.val==root.val || q.val==root.val) return root;
    else if(p.val < root.val && q.val > root.val) return root;
    else if(p.val > root.val && q.val < root.val) return root;
    else if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
    else return lowestCommonAncestor(root.right, p, q);

   }
    
}
