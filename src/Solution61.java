import java.util.Arrays;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution61
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 9:35
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solution61 {

    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<5)
            return false;
        Arrays.sort(numbers);
        int count = 0;
        for(int num:numbers){
            if(num==0)
                count++;
        }
        int gap=0;
        for(int i=count+1;i< numbers.length;i++){
            if(numbers[i]==numbers[i-1])
                return false;
            gap = gap+numbers[i]-numbers[i-1]-1;
        }
        if(gap<=count)
            return true;
        return false;
    }

}
