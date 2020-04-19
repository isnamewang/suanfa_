/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution36
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 17:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution36 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode lastNode = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        Convert1(pRootOfTree);
        TreeNode headNode = lastNode;
        while(headNode!=null&&headNode.left!=null){
            headNode=headNode.left;
        }
            return headNode;
    }

    public void Convert1(TreeNode pNode){

        if(pNode==null)
            return;
        if(pNode.left!=null)
            Convert1(pNode.left);
        pNode.left = lastNode;
        if(lastNode!=null)
            lastNode.right=pNode;
        lastNode=pNode;
        if(pNode.right!=null)
            Convert1(pNode.right);
    }

}
