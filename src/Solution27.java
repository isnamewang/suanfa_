/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution27
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/8 17:51
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/8      wusd          v1.0.0               修改原因
 */
public class Solution27 {


    static class ListNode{
        int val;
        ListNode left;
        ListNode right;
    }
    //树的镜像
    public static void Mirror(ListNode root){
        if(root == null)
            return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);

    }
    public static void swap(ListNode root){
        ListNode t = root.left;
        root.left=root.right;
        root.right=root.left;
    }



}
