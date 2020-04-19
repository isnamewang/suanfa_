/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution58
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/14 17:21
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/14      wusd          v1.0.0               修改原因
 */
public class Solution58 {
    private char[]str1;
    public static void main(String[] args){
        String s="  ";
        Solution58 s58 = new Solution58();
        System.out.println(s58.ReverseSentence(s).length());
    }

    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()<n)
            return new String("");
        str1 = str.toCharArray();
        Reverser(0,str1.length-1);
        Reverser(0,str1.length-1-n);
        Reverser(str1.length-n,str1.length-1);
        return new String(str1);
    }

    public String ReverseSentence(String str) {
        if(str==null||str.length()==0)
            return  "";
        str1=str.toCharArray();
        Reverser(0,str1.length-1);
        int begin=0,end=1;
        while(end<str1.length){
            if(str1[end]==' '&&end>0){
                Reverser(begin,end-1);
                while(end<str1.length&&str1[end]==' '){
                    end++;
                }
                begin=end;
            }else{
                end++;
            }
        }
        if(end==str1.length)
            Reverser(begin,end-1);
        return new String(str1);
    }

    private void Reverser(int begin,int end){
        while(begin<end){
            char temp = str1[begin];
            str1[begin]=str1[end];
            str1[end]=temp;
            begin++;
            end--;
        }
    }
}
