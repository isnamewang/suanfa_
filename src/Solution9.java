import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution9
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 14:15
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution9 {

    static Stack<Integer> stack1 = new Stack<>();
    static  Stack<Integer> stack2 = new Stack<>();


    public static void push(int node){
        if(stack1.size() != stack1.capacity()){
            stack1.push(node);
        }
    }
    public static int pop(){
        if(!stack2.isEmpty()){
            return  stack2.pop();
        }
        else if(stack2.isEmpty() && !stack1.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack1.pop();
        }
        return -1;
    }
}
