/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution16
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/2 15:52
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/2      wusd          v1.0.0               修改原因
 */
public class Solution16 {




    public static boolean invaild = false;//输入合法

    public static void main(String[] args){

        double r = power(2, -5);
        System.out.println(r);
    }
    // 指数运算
    public static double power(double base,int exponent){

        if((base==0.0)&&exponent<0){
            invaild = true;//输入不合法
            return 0.0;
        }
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        int absExponent = exponent;
        if(exponent<0)
            absExponent = -exponent;
        double result = power(base,absExponent>>1);
        result = result *result;
        if((absExponent&0x1) ==1)
            result = result * base;
        if(exponent<0)
            result = 1 /result;
        return result;

    }
}
