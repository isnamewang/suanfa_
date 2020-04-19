import java.util.ArrayList;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution62
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 10:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution62 {



    public static void main(String[] args){
        Solution62 s62 = new Solution62();
        System.out.println(s62.LastRemaining_Solution(5,3));
    }

    public int LastRemaining_Solution(int n, int m) {

        if(m<0||n<=0)
            return -1;
        ArrayList<Integer> number = new ArrayList<>();
        for(int i=0;i<n;i++)
            number.add(i);
        int begin=0;
        while(number.size()>1){
            for(int i=1;i<m;i++){
                begin++;
                if(begin==number.size()){
                    begin=0;
                }
            }
            number.remove(begin);
            if(begin==number.size()){
                begin=0;
            }
        }
        return number.get(0);

    }
    public int LastRemaining_Solution_1(int n, int m) {

        if(m<0||n<=0)
            return -1;
       int last =0;
       for(int i=2;i<=n;i++){
           last =(last+m)%i;
       }
        return last;
    }


}
