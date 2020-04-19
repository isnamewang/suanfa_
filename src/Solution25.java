import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution25
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 11:05
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution25 {

    static class ListNode{
        int val;
        ListNode next;
    }
    //合并两个有顺序的链表
    public static ListNode merge(ListNode l1, ListNode l2){

        if(l1 == null)
            return l2;
        if(l2 ==null)
            return l1;
        if(l1.val<=l2.val){
            l1.next = merge(l1.next,l2);
            return  l1;
        }
        else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }


}
