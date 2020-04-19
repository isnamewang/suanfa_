import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution59
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/14 19:03
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/14      wusd          v1.0.0               修改原因
 */
public class Solution59 {
    public PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1,o2)->o2-o1);
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num==null||num.length<=0||size<=0||size>num.length)
            return result;
        int index=0;
        for(;index<size;index++){
            maxQueue.offer(num[index]);
        }
        while(index<num.length){
            result.add(maxQueue.peek());
            maxQueue.remove(num[index-size]);
            maxQueue.add(num[index]);
            index++;
        }
        result.add(maxQueue.peek());
        return result;
    }

}
