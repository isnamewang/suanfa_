/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution67
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 17:55
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution67 {

    public int StrToInt(String str) {
        Integer res=0;
        try {
            res = new Integer(str);
        }catch (NumberFormatException e){

        }finally {
            return res;
        }

    }

    public int StrToInt_1(String str) {

        if(str==null || "".equals(str.trim()))
            return 0;
        str = str.trim();
        char[] array = str.toCharArray();
        int i=0,flag=1,result=0;
        if(array[i]=='-')
            flag=-1;
        if(array[i]=='+'||array[i]=='-')
            i++;
        while(i<array.length){
            if(IsNumber(array[i])){
                int digit = array[i]-'0';
                if(flag==1&&(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&digit>7)))
                    return 0;
                if(flag==-1&&(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&digit>8)))
                    return 0;
                result = result*10+digit;
                i++;
            }else{
                return 0;
            }
        }
        return result*flag;

    }
    private boolean IsNumber(char c){
        if(c>='0'&&c<='9')
            return true;
        return false;
    }

}
