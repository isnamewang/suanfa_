import javax.swing.text.html.parser.Entity;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution23
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 10:14
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution23 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n1;
        System.out.println(EntryNodeOfLoop(n1));



    }
    //如果一个链表有环找到入口点
    public static ListNode EntryNodeOfLoop(ListNode head){

        if(head == null || head.next == null)
            return null;
        ListNode slow = head,fast=head,fast1;
        do{
            slow = slow.next;
            fast1 = fast.next;
            fast = fast.next.next;
        }while (slow!=fast&&fast!=null&&fast1!=null);
        if(fast1==null||fast==null)
            return null;
        fast = head;
        while (slow!=fast){
            slow = slow.next;
            fast=fast.next;
        }

        return slow;
    }




}
