import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Exam1
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/20 16:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/20      wusd          v1.0.0               修改原因
 */
public class Exam1 {



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N,A,B,C;
        N=in.nextInt();
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        int[] a = new int[N+1];
        for(int i=1;i<N+1;i++)
            a[i]=in.nextInt();
        int[] flag = new int [N+1];
        System.out.println(cost(a,1,N,A,B,C,flag));

    }

    public static int cost(int[] a,int i,int N,int A,int B,int C,int[] flag){

        if(flag[i]==0) {
            flag[i]=1;
            if (i == N){
                flag[i]=0;
                return 0;
            }
            if (a[i] == N) {
                flag[i]=0;
                return A;
            }
            int t;
            if (a[i] > 1 && a[i] < N) {
                 t =Math.min(A + cost(a, a[i], N, A, B, C,flag), Math.min(A + B + cost(a, a[i] - 1, N, A, B, C,flag), A + C + cost(a, a[i] + 1, N, A, B, C,flag)));
            } else {
                t= Math.min(A + cost(a, a[i], N, A, B, C,flag), A + C + cost(a, a[i] + 1, N, A, B, C,flag));
            }
            flag[i]=0;
            return t;
        }else{
            return 100000001;
        }
    }


}
