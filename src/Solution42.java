/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution42
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/11 23:14
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/11      wusd          v1.0.0               修改原因
 */
public class Solution42 {

    public int FindGreatestSumOfSubArray(int[] array) {

        int sum,sumMax;
        if(array==null || array.length<=0)
            return 0;
        sumMax=array[0];
        sum=array[0];
        for(int i=1;i<array.length;i++){
            if(sum<=0)
                sum=array[i];
            else{
                sum+=array[i];
            }
            if(sum>=sumMax)
                sumMax=sum;
        }
        return sumMax;
    }
}
