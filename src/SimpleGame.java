import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.SimpleGame
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/20 9:24
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/20      wusd          v1.0.0               修改原因
 */
public class SimpleGame {


    public static void main(String[] args){
        int T;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        int[][] data = new int[T][3];
        for(int i=0;i<T;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            data[i][0]=a;
            data[i][1]=b;
            data[i][2]=n;
        }
        for(int i=0;i<T;i++){
            judgeGame(data[i][0],data[i][1],data[i][2]);
        }
    }
    public static void judgeGame(int a,int b,int n){
        if(a == 1){
            System.out.println("A&B");
            return;
        }
        int flag=0;
        while(Math.pow(a,b)<n){
            if (Math.pow(a+1, b) > Math.pow(a , b+1)) {
                b=b+1;
                flag++;
            }else {
                a=a+1;
                flag++;
            }
        }
        if(flag==0){
            System.out.println("A&B");
            return;
        }else if(flag>>1 ==1){
            System.out.println("A");
            return;
        }else{
            System.out.println("B");
        }
        return;
    }









}
