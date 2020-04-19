/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution52
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 21:59
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution52 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
                int length1,length2,dif;
                length1 = GetListLength(pHead1);
                length2 = GetListLength(pHead2);
                if(length1==0||length2==0)
                    return null;
                ListNode pLong,pshort;
                if(length1>length2){
                    pLong=pHead1;
                    pshort=pHead2;
                    dif=length1-length2;
                }else{
                    pLong=pHead2;
                    pshort=pHead1;
                    dif=length2-length1;
                }

                while(dif>0){
                    pLong=pLong.next;
                    dif--;
                }
                while(pLong!=pshort&&pLong!=null&&pshort!=null){
                    pLong=pLong.next;
                    pshort=pshort.next;
                }
                if(pLong==null||pshort==null)
                    return null;
                return pLong;
        }

        private int GetListLength(ListNode head){
            if(head==null)
                return 0;
            int length=0;
            while (head!=null){
                length++;
                head=head.next;
            }
            return length;
        }
    }

}
