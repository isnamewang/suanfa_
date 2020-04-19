/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution19
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 22:07
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution19 {

    public boolean match(char[] str, char[] pattern)
    {
        return matchStr(str,0,pattern,0);
    }

    private boolean matchStr(char[] str,int i,char[] pattern,int j){

        if(i==str.length&&j==pattern.length){
            return true;
        }else if(j==pattern.length){
            return false;
        }
        boolean next = (j+1<pattern.length)&&(pattern[j+1]=='*');
        if(next){
            if(i<str.length&&(str[i]==pattern[j]||pattern[j]=='.')){
                return matchStr(str,i,pattern,j+2)||matchStr(str,i+1,pattern,j)
                        || matchStr(str,i+1,pattern,j+2);
            }else{
                return matchStr(str,i,pattern,j+2);
            }
        }else{
            if(i<str.length&&(str[i]==pattern[j]||pattern[j]=='.'))
                return matchStr(str,i+1,pattern,j+1);
            return false;
        }
    }

}
