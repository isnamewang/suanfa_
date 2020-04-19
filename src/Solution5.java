/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution5
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/25 17:19
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/25      wusd          v1.0.0               修改原因
 */
public class Solution5 {

    public String replaceSpace(StringBuffer str){

        if(str == null){
            return null;
        }
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' '){
                str.replace(i, i+1,"%20");
            }
        }
        String newStr= str.toString();
        return newStr;
        //return str.toString().replace("\\s", "%20");
    }



}
