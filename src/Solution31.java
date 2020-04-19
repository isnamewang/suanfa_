import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution31
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 10:43
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution31 {

    public boolean isPopOrder(int[] pushSequence,int[] popSequence){
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for(int pushIndex=0,popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushSequence[pushIndex]);
            while(!stack.isEmpty()&&popIndex<n&&
                    stack.peek()==popSequence[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
    return stack.isEmpty();
    }



}
