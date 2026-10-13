import java.util.*;
public class _04_LC_450_Delete_Node_in_a_BST {

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
   
        //  root = [5,3,6,2,4,null,7], key = 3;

        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(2);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(7);
        b.right=e;

        int key=3;

        System.out.println(deleteNode(root, key));  // Output: [5,4,6,2,null,null,7]

    }


    public static TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp=new TreeNode(Integer.MAX_VALUE);
        temp.left=root;
        deleteNodeOf1Child(temp,key);
        root=temp.left;
        return root;
    }


            public static  void deleteNodeOf1Child(TreeNode root, int target){
         if(root==null) return ;

         if(root.val>target){
            if(root.left==null) return;
            if(root.left.val==target){
               TreeNode l=root.left;
               if(l.left==null && l.right==null) root.left=null;
               else if(l.left==null || l.right==null){
                if(l.left!=null) root.left=l.left;
                else root.left=l.right;
               }
               else{
                TreeNode curr=l;
                TreeNode pred=curr.left;
                while(pred.right!=null) pred=pred.right;
                deleteNodeOf1Child(root,pred.val);
                pred.left=curr.left;
                pred.right=curr.right;
                root.left=pred;
               }
            } 
            else deleteNodeOf1Child(root.left, target);
         }

         else {
            if(root.right==null) return;
            if(root.right.val==target) {
                TreeNode r=root.right;
               if(r.left==null && r.right==null) root.right=null;
               else if(r.left==null || r.right==null){
                if(r.left!=null) root.right=r.left;
                else root.right=r.right;
               }
               else{
                TreeNode curr=r;
                TreeNode pred=curr.left;
                while(pred.right!=null) pred=pred.right;
                deleteNodeOf1Child(root,pred.val);
                pred.left=curr.left;
                pred.right=curr.right;
                root.right=pred;
               }
            }
            else deleteNodeOf1Child(root.right, target);
         }
    }

}
