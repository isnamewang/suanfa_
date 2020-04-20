import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Trade
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/20 11:22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/20      wusd          v1.0.0               修改原因
 */
public class Trade {

    static class State{
        long money;
        int count;
        public State(long money,int count){
            this.money=money;
            this.count=count;
        }
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        State[][] dp = new State[n][2];
        dp[0][0] = new State(0,0);
        dp[0][1] = new State(-A[0],1);
        for(int i=1;i<n;i++){
            if(dp[i-1][1].money>=dp[i-1][0].money-A[i]){
                dp[i][1] = new State(dp[i-1][1].money,dp[i-1][1].count);
            }else {
                dp[i][1] = new State(dp[i-1][0].money-A[i],dp[i-1][0].count+1);
            }
            if(dp[i-1][0].money>=dp[i-1][1].money+A[i]){
                dp[i][0] = new State(dp[i-1][0].money,dp[i-1][0].count);
            }else{
                dp[i][0] = new State(dp[i-1][1].money+A[i],dp[i-1][1].count+1);
            }
        }
        if(dp[n-1][0].money==dp[n-1][1].money){
            if(dp[n-1][0].count<=dp[n-1][1].count){
                System.out.println(dp[n-1][0].money+" "+dp[n-1][0].count);
            }else{
                System.out.println(dp[n-1][1].money+" "+dp[n-1][1].count);
            }
        }else if(dp[n-1][0].money>dp[n-1][1].money){
            System.out.println(dp[n-1][0].money+" "+dp[n-1][0].count);
        }else{
            System.out.println(dp[n-1][1].money+" "+dp[n-1][1].count);
        }
    }
}
