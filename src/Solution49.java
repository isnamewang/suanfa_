/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution49
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 15:50
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution49 {


    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        int[] result = new int[index];
        result[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;//p2,3,5代表在排序好的丑数里第一个乘以2,3,5大于最大数的指针
        for (int i = 1; i < index; i++) {
            int min = Math.min(result[p2] * 2, Math.min(result[p3] * 3, result[p5] * 5));
            result[i]=min;
            if (min == result[p2] * 2) p2++;
            if (min == result[p3] * 3) p3++;
            if (min == result[p5] * 5) p5++;
        }
        return result[index - 1];
    }
}
