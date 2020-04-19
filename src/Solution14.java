/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution14
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 17:16
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution14 {


    public static void main(String[] args){
        int length = 4;
        System.out.println(maxProductAfterCutting(length));
    }

    public static int maxProductAfterCutting(int length){

        if(length < 2)
            return 0;
        if(length == 2)
            return 1;
        if(length == 3)
            return 2;

        int[] maxlength_I = new int[length+1];
        maxlength_I[0]=0;
        maxlength_I[1]=1;
        maxlength_I[2]=2;
        maxlength_I[3]=3;
        int max = 0;
        for(int i = 4;i<=length;i++){
            max = 0;
            for(int j=1;j<=i/2;j++){
                int product = maxlength_I[j]*maxlength_I[i-j];
                if(product > max)
                    max = product;
            }
            maxlength_I[i]=max;
        }
        max = maxlength_I[length];

        return max;
    }

    public int cutRope(int target) {

        if(target<2)
            return 0;
        if(target == 2)
            return 1;
        if(target == 3)
            return 2;
        int[] maxLength = new int[target];
        maxLength[0]=0;
        maxLength[1]=1;
        maxLength[2]=2;
        maxLength[3]=3;
        for(int i=4;i<=target;i++){
            int max=0;
            for(int j=1;j<=target/2;j++){
                if(maxLength[j]*maxLength[target-j]>max)
                    max=maxLength[j]*maxLength[target-j];
            }
            maxLength[i]=max;
        }
        return maxLength[target];
    }



}
