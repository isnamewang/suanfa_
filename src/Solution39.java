/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution39
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/11 22:13
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/11      wusd          v1.0.0               修改原因
 */
public class Solution39 {

    public int MoreThanHalfNum_Solution(int[] array) {

        if(array==null || array.length==0)
            return 0;
        int num=1;
        int result = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]==result)
                num++;
            else
                num--;
            if(num==0){
                result=array[i];
                num=1;
            }
        }
        num=0;
        for(int val : array){
            if(val==result)
                num++;
        }
        return num>array.length/2?result:0;
    }
}
