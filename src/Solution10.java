/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution10
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 14:26
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution10 {

    public static int Finbonacci(int n){
        if(n<0)
            return -1;
        if(n == 0)
            return  0;
        if(n==1 || n==2)
            return 1;
        int one = 1;
        int two = 1;
        int sum = 0;
        for(int i = 0;i< n-2;i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }








}
