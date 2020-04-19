import java.util.ArrayList;
import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution6
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/25 17:32
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/25      wusd          v1.0.0               修改原因
 */
public class Solution6 {

    public ArrayList<Integer> PrintFromTailToHead(Node node){
        Stack<Integer> stack = new Stack<>();
        while(node != null){
            stack.push(node.val);
            node = node.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
     }

    public void PrintFromTailToHead1(Node node){
        while(node != null){
          if(node.next != null){
              PrintFromTailToHead1(node.next);
          }
            System.out.println(node.val);
        }

    }

}
