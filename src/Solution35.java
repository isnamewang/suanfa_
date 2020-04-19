import java.util.Random;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution35
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 17:05
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution35 {

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead){

        CloneNodes(pHead);
        ConnectNodes(pHead);
        return ReconnectNodes(pHead);
    }
    public void CloneNodes(RandomListNode pHead){
        RandomListNode pNode = pHead;
        while(pNode!=null){
            RandomListNode cloneNode = new RandomListNode(pNode.label);
            cloneNode.next=pNode.next;
            pNode.next=cloneNode;
            pNode = cloneNode.next;
        }
    }
    public void ConnectNodes(RandomListNode pHead){
        RandomListNode pNode = pHead;
        while(pNode!=null){

            RandomListNode cloneNode = pNode.next;
            if(pNode.random!=null){
                cloneNode.random=pNode.random.next;
            }
            pNode = cloneNode.next;
        }
    }

    public RandomListNode ReconnectNodes(RandomListNode pHead){

        RandomListNode pNode = pHead;
        RandomListNode cloneHead = null;
        RandomListNode cloneNode = null;
        if(pNode!=null){
            cloneHead = pNode.next;
            cloneNode = pNode.next;
            pNode.next=cloneNode.next;
            pNode = pNode.next;
        }
        while(pNode!=null){
            cloneNode.next = pNode.next;
            cloneNode = cloneNode.next;
            pNode.next = cloneNode.next;
            pNode=pNode.next;
        }
        return cloneHead;
    }

}
