/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution22
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 9:56
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution22 {



    class ListNode{
        int val;
        ListNode next;
    }
    //倒数第k个节点
    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null)
            return null;
        ListNode p1 = head;
        while ((p1!=null)&&(k--)>0){
            p1=p1.next;
        }
        if(k>0)
            return null;
        ListNode p2 = head;
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
