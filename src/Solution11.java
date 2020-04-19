import java.util.concurrent.locks.ReadWriteLock;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution11
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 15:54
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution11 {



    public static int looksmall(int[] data) {

        if (data.length == 0)
            return 0;
        int head = 0;
        int tail = data.length - 1;
        int middle = head;

        while (head < tail) {
            if (data[head] < data[tail])
                return data[head];
            middle = (head + tail) / 2;
            if (data[middle] >data[head])
               head=middle+1;
            else if (data[middle] < data[tail])
                tail=middle;
            else
                head++;
        }
        return data[head];
    }

}
