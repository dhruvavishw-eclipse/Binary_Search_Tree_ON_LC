import java.util.*;
public class _08_LC_230_Kth_Smallest_Element_in_a_BST {


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
     
        // Input: root = [5,3,6,2,4,null,null,1];

        TreeNode root= new TreeNode(5);
        TreeNode a= new TreeNode(3);
        TreeNode b= new TreeNode(6);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(2);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(1);
        c.left=e;
        int k=3;


        System.out.println(kthSmallest(root, k));
    }

    public static int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arr=new ArrayList<>();

        ArrayList<Integer> ans=inorder( root,arr);
        return ans.get(k-1);
    }

	private static ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr) {
		if(root==null) return null;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
	}
}
