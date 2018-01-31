/*
给定一个范围区间，将一个二叉查找树修剪至该区间内。
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1
//递归的思想：
1:空结点考察
2:由于二叉查找树的特点，如果该结点的值<L,那么只需要考虑trim右结点的结果。
			   同样的，如果该结点的值>R,那么只需要考虑trim左结点的结果。
			   再者，如果这个值在L与R之间，让他的左节点等于trim左节点，右节点等于trim右节点。


*/

			   /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)
            return root;
        if(root.val<L)
            return trimBST(root.right,L,R);
        if(root.val>R)
            return trimBST(root.left,L,R);
        
        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
          
    }
}
