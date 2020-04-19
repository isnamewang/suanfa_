import java.util.ArrayList;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution29
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/8 23:11
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/8      wusd          v1.0.0               修改原因
 */
public class Solution29 {

    //顺时针输出矩阵
    public static ArrayList<Integer> printMartix(int[][] martix){
        ArrayList<Integer> result = new ArrayList<>();
        int r1=0,r2=martix.length-1,c1=0,c2=martix[0].length-1;
        while(r1<=r2 && c1<=c2){
            for(int i=c1;c1<=c2;i++)
                result.add(martix[r1][i]);
            for(int i=r1+1;i<=r2;i++)
                result.add(martix[i][c2]);
            if(r1!=r2){
                for(int i=c2-1;i>=c1;i--)
                    result.add(martix[r2][i]);
            }
            if(r1!=r2){
                for(int i=r2-1;i>=r1;i--)
                    result.add(martix[i][c1]);
            }
            r1++;r2--;c1++;c2--;
        }
        return result;
    }

}
