import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution68
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 23:19
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution68 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null || k<=0)
            return null;
        TreeNode result=null;
        Stack<TreeNode> min = new Stack<>();
        TreeNode t = pRoot;
        min_Stack(min,t);
        while(k>0){
            result=min.pop();
            k--;
        }
        return result;
    }
    private void min_Stack(Stack<TreeNode> min, TreeNode t){
        if(t.left!=null){
          min_Stack(min,t.left);
        }
        min.push(t);
        if(t.right!=null){
           min_Stack(min,t.right);
        }
    }


}
