import java.util.*;
public class _07_LC_108_Convert_Sorted_Array_to_BST {

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

    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }


    public static void main(String RCB []){
      int [] nums = {-10,-3,0,5,9};

       sortedArrayToBST(nums);
       inorder(sortedArrayToBST(nums));;
    }

    

	private static TreeNode sortedArrayToBST(int[] nums) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'sortedArrayToBST'");
     
        int n=nums.length;

        return BST(nums,0,n-1);

	}

	private static TreeNode BST(int[] nums, int low, int high) {
		if(low>high) return null;
        int mid= low + (high - low)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=BST(nums, low, mid-1);
        root.right=BST(nums, mid+1, high);
        return root;
	}

}
