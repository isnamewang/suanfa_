/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution43
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 9:48
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution43 {
    public int NumberOf1Between1AndN_Solution(int n) {
            int m,result=0,head,tail;
            for(m=1;m<n;m*=10){
                head = n/m;
                tail = n%m;
                result = (head+8)/10*m+(head%n==1?tail+1:0);
            }
            return result;
    }

}
