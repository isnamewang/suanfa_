/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution20
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 9:06
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution20 {


    //判断一个字符串是否为数值
    public boolean isnumber(String str){
        if(str == null || str.length()==0)
            return false;
        return str.matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
    public boolean isNumeric(char[] str) {
        if(str==null||str.length==0)
            return false;
        String s1 = String.valueOf(str);
        return s1.matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d*)?");

    }


}
