/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solutoion3
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/15 18:23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/15      wusd          v1.0.0               修改原因
 */
public class Solutoion3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        if(numbers==null||length<=0)
            return false;
        int i=0;
        for( i=0;i<length;i++){
            if(numbers[i]<0||numbers[i]>=length)
                return false;
        }
        for( i=0;i<length;i++){
            while (numbers[i]!=i){
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }
                int temp=numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return false;
    }
}
