import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/1 16:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/1      wusd          v1.0.0               修改原因
 */
public class Solution {
    public static void main(String[] args){

        int t,m,n;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t>0){
            t--;
            boolean flag = false;
            n = in.nextInt();
            m = in.nextInt();
            int[] thing = new int[n];
            int [] hurt = new int[m];
            int[] cost = new int[m];
            for(int i=0;i<n;i++)
                thing[i]=in.nextInt();
            for(int i=0;i<m;i++)
                hurt[i]=in.nextInt();
            for(int i=0;i<m;i++)
                cost[i]=in.nextInt();
           if(m>=n){
               for(int i=0;i<cost.length;i++){
                   for(int j=0;j<cost.length-i-1;j++){
                       if(cost[j]>cost[j+1]){
                           int temp = cost[j];
                           cost[j]=cost[j+1];
                           cost[j+1]=temp;
                           temp=hurt[j];
                           hurt[j+1]=hurt[j];
                           hurt[j]=temp;
                       }
                   }
               }
               for(int i=0;i<thing.length;i++){
                   for(int j=0;j<thing.length-i-1;j++){
                       if(thing[j]<thing[j+1]){
                           int temp = thing[j];
                           thing[j]=thing[j+1];
                           thing[j+1]=temp;
                       }
                   }
               }

               int count=0;
               int costs=0;
               int[] vi = new int[n];
               int[] vy = new int[m];
               for(int i=0;i<hurt.length;i++){
                  for(int j=0;j<thing.length;j++){
                      if(hurt[i]>=thing[j]&&vi[j]==0&&vy[i]==0){
                          costs+=cost[i];
                          //System.out.println(cost[i]+""+i);
                          vi[j]=1;
                          vy[i]=1;
                          count++;
                          break;
                      }
                      if(count == thing.length)
                          break;;
                  }
               }
               //System.out.println(cost[2]);
               if(count == thing.length)
                   flag=true;
               if(flag)
                   System.out.println(costs);
               else
                   System.out.println("No");

           }

        }

    }

}
