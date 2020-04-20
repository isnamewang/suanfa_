import java.util.HashMap;
import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.EdgeWight
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/20 10:51
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/20      wusd          v1.0.0               修改原因
 */
public class EdgeWight {


    public static void main(String[] args){

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] array = new int[n];//n个点的点权
        int[] count_pre = new int [n];//在第i点时前面有几个点和他们相同；
        HashMap<Integer,Integer> weight_Size = new HashMap<>();//点全值相同的次数
        for(int i=0;i<n;i++){
            int weight = in.nextInt();
            array[i]=weight;
            count_pre[i]=weight_Size.getOrDefault(array[i],0);
            weight_Size.put(array[i],count_pre[i]+1);
        }
        int pre=0;
        int[] side_Weight = new int[n];
        for(int i=0;i<n-1;i++){

            int temp = pre - (i-count_pre[i]);
            temp=temp+(n-i-(weight_Size.get(array[i])-count_pre[i]));
            side_Weight[i]=temp;
            pre=temp;
        }
        for(int i=0;i<n-1;i++)
            System.out.println(side_Weight[i]+" ");
    }

}
