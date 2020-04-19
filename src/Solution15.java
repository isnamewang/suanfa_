import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution15
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/31 9:38
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/31      wusd          v1.0.0               修改原因
 */
public class Solution15 {

    public static void main(String[] args){



        //在一个由1和0组成的字符串有多少个子串中1的数量等于k
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String str = in.next();
        int[] dp = new int[str.length()+2];
       // System.out.println(dp[0]);
        int num=0;
        int result=0;
        dp[0]=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                num++;
            if(num>=k){
                result+=dp[num-k];
                System.out.println(":"+dp[num-k]);
            }
            dp[num+1]=0;
            dp[num]++;
        }
        System.out.println(result);
    }
    public static int look_one_num(int n){

        int result=0;
        while(n>0){
            result++;
            n = n &(n-1);
        }
        return result;
    }

}
