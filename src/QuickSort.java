import java.util.Random;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.QuickSort
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 15:19
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class QuickSort {

    private void Swap(Integer x1,Integer x2){
        int temp = x1;
        x1 = x2;
        x2 = temp;
    }
    private int Partition(int[] data,int length,int start,int end){
        if(length <= 0)
            return -1;
        int small = start-1;
        for(int index=start;index<end;index++){

            if(data[index]<data[end]) {
                small++;
                if (small != index) {
                    Swap(data[small], data[index]);
                }
            }
        }
        small++;
        Swap(data[small],data[end]);
        return small;
    }

    public void QSort(int[] data,int length,int start,int end){

        if(start == end)
            return;
        int index = Partition(data, length, start, end);
        if(index > start)
            QSort(data, length, start, index-1);
        if(index<end)
            QSort(data,length,index+1,end);

    }

}
