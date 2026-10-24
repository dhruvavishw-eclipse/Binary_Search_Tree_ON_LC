import java.util.*;
public class _14_LC_1305_All_Elements_in_Two_BST {
    
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

    public static void main(String [] BKP){
        // Input: root1 = [2,1,4], root2 = [1,0,3]
       TreeNode root1= new TreeNode(2);
       TreeNode a=new TreeNode(1);
       TreeNode b=new TreeNode(4);
       root1.left=a;
       root1.right=b;


       TreeNode root2= new TreeNode(1);
       TreeNode c=new TreeNode(0);
       TreeNode d=new TreeNode(3);
       root2.left=c;
       root2.right=d;

       System.out.println(getAllElements(root1, root2)); // Output: [0,1,1,2,3,4]


    }


       public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a= new ArrayList<>();
        TreeNode curr=root1;

        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                    if(pred.right==null){
                        pred.right=curr;
                       curr= curr.left;
                    }

                    if(pred.right==curr){
                        pred.right=null;
                        a.add(curr.val);
                        curr=curr.right;
                    }           
               }

             else{
                        a.add(curr.val);
                        curr=curr.right;
             }
        }


       ArrayList<Integer> b= new ArrayList<>();
         curr=root2;

        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                    if(pred.right==null){
                        pred.right=curr;
                        curr=curr.left;
                    }

                    if(pred.right==curr){
                        pred.right=null;
                        b.add(curr.val);
                        curr=curr.right;
                    }

            }
                    else{
                        b.add(curr.val);
                        curr=curr.right;
                    }
                
        }

        ArrayList<Integer> ans=new ArrayList<>();
        merger(a,b,ans);
        return ans;
       
    }

    public static void merger(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> ans){
        int i=0 , j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)){
                ans.add(a.get(i));
                i++;
            }
            else{
                ans.add(b.get(j));
                j++;
            }
        }

        if(i==a.size()){
            while(j<b.size()){
                ans.add(b.get(j));
                j++;
            }
        }

        if(j==b.size()){
             while(i<a.size()){
                ans.add(a.get(i));
                i++;
            }
        }
    }


}



