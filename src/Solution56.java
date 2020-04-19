import java.security.PrivilegedExceptionAction;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution56
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/14 15:51
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/14      wusd          v1.0.0               修改原因
 */
public class Solution56 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if(array==null||array.length<2)
            return;
        int resultOR=array[0];
        for(int i=1;i<array.length;i++){
            resultOR = resultOR ^array[i];
        }
        int indexBit = FindFirst_1Bits(resultOR);
        for(int i=0;i<array.length;i++){
            if(IsBits1(array[i],indexBit)){
                num1[0]=num1[0]^array[i];
            }else {
                num2[0]=num2[0]^array[i];
            }
        }
    }
    private int FindFirst_1Bits(int num) {
        int result = 0;
        while ((num & 1) == 0){
            num=num>>1;
            result++;
        }
        return result;
    }
    private boolean IsBits1(int num,int index){
        num=num>>index;
        return (num & 1 )==1;
    }

}
