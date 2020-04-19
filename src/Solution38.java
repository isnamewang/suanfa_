import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution38
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/11 9:49
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/11      wusd          v1.0.0               修改原因
 */
public class Solution38 {
    private ArrayList<String> ret=new ArrayList<>();
    private char[] str;


    public static void main(String[] args) {
        String s = "abc";
        Solution38 s38 = new Solution38();
        s38.str = s.toCharArray();
       ArrayList<String> as = s38.Permutation(s);
        Collections.sort(as);
        for(int i=0;i<as.size();i++)
            System.out.println(as.get(i));
    }

    public ArrayList<String> Permutation(String str1) {
        if(str1.length()==0){
            return ret;
        }
        str = str1.toCharArray();
        trackLiat(0);
        return ret;
    }

    public void trackLiat(int begin) {

        if(begin == str.length){
            ret.add(String.valueOf(str));
            return;
        }
        for(int i = begin;i<str.length;i++){
            if(i!=begin&&str[i]==str[begin]){
                continue;
            }else{
            char temp = str[i];
            str[i] = str[begin];
            str[begin] = temp;
            trackLiat(begin+1);

            temp = str[i];
            str[i] = str[begin];
            str[begin] = temp;}

        }
    }

}
