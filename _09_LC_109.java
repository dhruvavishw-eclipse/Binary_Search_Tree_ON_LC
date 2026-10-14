import java.util.*;
public class _09_LC_109 {

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

    
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String RCB []){
    //   Input: head = [-10,-3,0,5,9];

    //    Output: [0,-3,9,-10,null,5];
    //  return sortedListToBST(null);   
    
    }

     public static TreeNode sortedListToBST(ListNode head) {
      ListNode temp=head;
      int n=0;
      while(temp!=null){
        n++;
        temp=temp.next;
      }

      int nums []=new int[n];
      int i=0;
      temp=head;
      while(temp!=null){
        nums[i++]=temp.val;
        temp=temp.next;   
      }


      return tree(nums,0,n-1);
    }

    public static TreeNode tree(int [] nums,int low, int high){
        if(low>high) return null;
        int mid= low + (high-low)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=tree(nums,low,mid-1);
        root.right=tree(nums,mid+1,high);
        return root;
    }


}
