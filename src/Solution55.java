import sun.reflect.generics.tree.Tree;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution55
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 23:27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution55 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
        public int TreeDepth(TreeNode root) {
                if(root == null)
                    return 0;
                int left = TreeDepth(root.left);
                int right = TreeDepth(root.right);
                return left>right?left+1:right+1;
        }
        //判断是否为平衡二叉树
        public boolean IsBalanced_Solution(TreeNode root) {
        /*
                if(root == null)
                    return true;
                int left = TreeDepth(root.left);
                int right = TreeDepth(root.right);
                if(Math.abs(left-right)>1)
                    return false;
                return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);*/
            return depth(root)!=-1;
        }

        public int depth(TreeNode root){
            if(root==null)
                return 0;
            int left = depth(root.left);
            if(left==-1)return -1;
            int right = depth(root.right);
            if(right==-1)return -1;
            if((left-right)<-1||(left-right)>1)
                return -1;
            else
                return 1+(left>right?left:right);
        }


}
