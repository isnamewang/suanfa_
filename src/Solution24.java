import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution24
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 10:38
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution24 {

    static class ListNode{
        int val;
        ListNode next;
    }

    //翻转链表
    //递归
    public ListNode ReverseList(ListNode head){

        if(head == null ||head.next==null)
            return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
    //迭代,使用头插法
    public static ListNode Reverse(ListNode head){

        ListNode newList = new ListNode();
        while(head!=null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;

        }
          return newList.next;
    }



}
