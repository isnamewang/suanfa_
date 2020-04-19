import java.util.Scanner;
import java.util.Stack;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution26
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 11:13
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution26 {

    static class ListNode{
        int val;
        ListNode left;
        ListNode right;
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean flag = judge(s);
        System.out.println(flag);
    }

    //判断一棵树是否为一棵树的子树
    public static boolean isSonTree(ListNode root1,ListNode root2){

        if(root1==null || root2 == null)
            return false;
        return isSonTreeForRoot(root1,root2)||isSonTree(root1.left,root2)
                ||isSonTree(root1.right,root2);
    }
    public static boolean isSonTreeForRoot(ListNode root1,ListNode root2){

        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return isSonTreeForRoot(root1.right,root2.right)&&isSonTreeForRoot(root1.left,root2.left);


    }




    //判断括号是否对称
    public static boolean judge(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c== '[' || c== '(')
                stack.push(c);
            else if(c == '}' || c==']' || c==')'){
                if(stack.isEmpty())
                    return false;
                if(c == '}' && '{'!=stack.lastElement())
                    return  false;
                if(c == ']' && '['!=stack.lastElement())
                    return  false;
                if(c == ')' && '('!=stack.lastElement())
                    return  false;
                stack.pop();

            }
        }
        if(!stack.isEmpty())
            return false;
        return true;

    }

}
