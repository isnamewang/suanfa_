import java.awt.event.FocusEvent;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution4
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/25 16:18
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/25      wusd          v1.0.0               修改原因
 */
public class Solution4 {

        public boolean find(int[][] array ,int target){
            int i=0;//列
            int len =array.length-1;//行
            while( ( i < array[0].length) && (len>=0) ){

                if(array[len][i] > target){
                    len--;
                }
                else if(array[len][i]<target){
                    i++;
                }
                else{
                   return true;
                }
            }

            return false;
        }

}
