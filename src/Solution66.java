/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution66
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 18:40
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution66 {
    public int[] multiply(int[] A) {

        if(A==null||A.length<=1)
            return null;
        int length = A.length;
        int[] B = new int[length];
        B[0]=1;
        for(int i=1;i<length;i++){
            B[i]=B[i-1]*A[i-1];
        }
        int temp=1;
        for(int i=length-1;i>=0;i--){
            B[i]= temp*B[i];
            temp=A[i]*temp;
        }
        return B;
    }

}
