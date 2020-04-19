/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution28
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/7 15:53
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/7      wusd          v1.0.0               修改原因
 */
public class Solution28 {

    static class ListNode{
        boolean val;
        ListNode left;
        ListNode right;
    }
    public static void main(String[] args){

        ListNode s1 = new ListNode();
        ListNode s2 = new ListNode();
        ListNode s3 = new ListNode();
        ListNode s4 = new ListNode();
        ListNode s5 = new ListNode();
        ListNode s6 = new ListNode();
        ListNode s7 = new ListNode();
        ListNode s8 = new ListNode();
        s1.left = s2;
        s1.right = s3;
        s3.val=true;
        s2.left=s4;
        s2.right=s5;
        s5.val=true;
        s4.left=s6;
        s4.right=s7;
        s6.val=false;
        s7.val=true;
        System.out.println(rootIsTrue(s1));



    }
    //判断一棵二叉树为对称的
    public static boolean isSymmetrical(ListNode root){
            if(root == null)
                return true;
            return isSymmertical(root.left,root.right);
    }
    public static boolean isSymmertical(ListNode left,ListNode right){
        if(left == null && right ==null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val!=right.val)
            return false;
        return isSymmertical(left.left,right.right)&&isSymmertical(left.right,right.left);

    }





    // 判断根节点的值  一棵树只有叶子节点有值当非叶子节点的左节点和右节点为true此节点为true
    // 递归
    public static boolean rootIsTrue(ListNode root) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return root.val;
        if (root.right != null && root.left != null)
            return rootIsTrue(root.right) && rootIsTrue(root.left);
        if (root.right != null && root.left == null)
            return rootIsTrue(root.right);
        if (root.right == null && root.left != null)
            return rootIsTrue(root.left);
        return false;

    }




}
