import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution30
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/8 23:24
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/8      wusd          v1.0.0               修改原因
 */
public class Solution30 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node){
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(),node));
    }
    public void pop(){
        dataStack.pop();
        minStack.pop();
    }
    public int min(){
        return minStack.peek();
    }


}
