import java.util.LinkedList;
import java.util.Queue;

public class _02_LC_701_Insert_into_a_BST {

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


  public static void BFS(TreeNode root) {
    if (root == null) return;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        TreeNode curr = q.remove();

        System.out.print(curr.val + " ");

        if (curr.left != null)
            q.add(curr.left);

        if (curr.right != null)
            q.add(curr.right);
    }
}


  public static void main(String RCB []){

     TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(7);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;

        int val=5;

        TreeNode ans=insertBST(root, val);  // [4,2,7,1,3,5]
        BFS(ans);  // Used for printing the ans in BFS order
  }

  public static TreeNode insertBST(TreeNode root,int val){
    if(root==null) return new TreeNode(val);

    if(root.val > val){
        root.left= insertBST( root.left, val);
    }

    else{
        root.right=insertBST(root.right, val);
    }

    return root;

  }
    
}
