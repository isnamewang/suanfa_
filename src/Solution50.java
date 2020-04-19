import java.util.HashMap;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution50
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 17:17
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution50 {


    public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0)
            return -1;
        int[] hash = new int[256];
        for(int i=0;i<str.length();i++)
            hash[str.charAt(i)]++;
        for(int i=0;i<str.length();i++){
            if(hash[str.charAt(i)]!=0)
                return i;
        }
        return -1;
    }

}
