import java.util.*;
public class _13_LC_94_Binary_Tree_Inorder_Traversal {

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
       // Input: root = [1,null,2,3]
       TreeNode root= new TreeNode(1);
       TreeNode a=new TreeNode(2);
       root.right=a;

       TreeNode b=new TreeNode(3);
       a.right=b;

    //    System.out.println(inorderTraversal(root)); This one by Morris Traversal 


  
      ArrayList<Integer> ans=new ArrayList<>();
      inorder(root, ans);
      
      System.out.println(ans); // This one by normal Inorder Traversal



   }


      static List<Integer> inorderTraversal(TreeNode root) {
        // Morris Traversal 
        TreeNode curr=root;
        List<Integer> arr=new ArrayList<>();

        while(curr!=null){
           if(curr.left!=null){ // Find pred
            TreeNode pred=curr.left;
            while(pred.right!=null && pred.right!=curr){
                pred=pred.right;
            }
            
            if(pred.right==null){  // Connect pred with curr 
                pred.right=curr;
                curr=curr.left;
            }

            if(pred.right==curr){  // Disconnect pred and curr 
                pred.right=null;
                arr.add(curr.val);
                curr=curr.right;
            }

           }
  
           else{  //  curr.left= null , no pred
            arr.add(curr.val); 
            curr=curr.right;
           }
        }
        return arr;
    }



     static void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return ;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
     }

}
