/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution18
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/16 10:42
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/16      wusd          v1.0.0               修改原因
 */
public class Solution18 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead)
    {

        if(pHead==null || pHead.next==null)
            return pHead;

        ListNode pre = new ListNode(-1);
        pre.next=pHead;
        ListNode result=pre;
        ListNode current = pHead;
        while(current!=null){
          ListNode next = current.next;
          boolean equal = false;
          if(next!=null&&next.val==current.val)
              equal=true;
          if(!equal){
              pre=current;
              current=next;
          }else{
              while(next!=null&&next.val==current.val){
                  next=next.next;
              }
              pre.next=next;
              current=next;
          }
        }
        return result.next;
    }

}
