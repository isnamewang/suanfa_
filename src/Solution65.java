import sun.plugin.net.proxy.WNetscape6BrowserProxyHandler;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution65
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 17:47
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution65 {


    public int Add(int num1,int num2) {

        int addNum=0,carry_bit=0;
        do{
            addNum = (num1^num2);
            carry_bit = (num1&num2) << 1;
            num1=addNum;
            num2=carry_bit;
        } while (carry_bit!=0);
        return addNum;
    }
}
