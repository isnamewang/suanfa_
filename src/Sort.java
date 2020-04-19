import com.sun.corba.se.impl.interceptors.PICurrent;
import javafx.util.Builder;

import java.util.Arrays;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Sort
 * @Description: 该类的功能描述
 * @ve,rsion: v1.0.0
 * @author: wusd
 * @date: 2020/3/31 23:45
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/31      wusd          v1.0.0               修改原因
 */
public class Sort {

    public static void main(String[]args){
       /* int[] array = {1,8,2,6,9,5,41,25,67,5,8};
        array = heap_Sort(array);
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);*/
       byte s1 = 1;
    }



    //冒泡排序
    public static void bubbleSort(int[] array){
        if(array.length==0)
            return ;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    //选择排序
    public static void selection_Sort(int[] array){
        if(array.length==0)
            return;
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[minIndex])
                    minIndex=j;
            }
            int temp = array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
    }
    //插入排序
    public static void Insertion_Sort(int[] array){

        if(array.length==0)
            return;
        int current;//当前插入值
        for(int i=0;i<array.length;i++){
            current = array[i+1];
            int preIndex=i;
            while(preIndex>=0 && current<array[preIndex]){
                array[preIndex+1]=array[preIndex];
                preIndex--;
            }
            array[preIndex+1]=current;
        }
    }
    //归并排序
    public static int[] Merge_Sort(int[] array){
        if(array.length <2)
            return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(Merge_Sort(left),Merge_Sort(right));
    }
    public static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];
        for(int index=0,i=0,j=0;index<result.length;index++){
            if(i>=left.length)
                result[index]=right[j++];
            else if(j>=right.length)
                result[index]=left[i++];
            else if(left[i]>right[j])
                result[index] = right[j++];
            else
                result[index]=left[i++];
        }
        return result;

    }

    //快速排序
    public static void quickSort(int[] array,int start,int end){

        if(array.length<1 || start<0 ||end>=array.length||start>end)
            return ;
        int smallIndex = partition(array,start,end);
        if(smallIndex>start)
            quickSort(array,start,smallIndex-1);
        if(smallIndex<end)
            quickSort(array,smallIndex+1,end);

    }
    public static int partition(int[] array,int start,int end){
        int pivot = (int)(start+Math.random())*(end-start+1);
        int smallIndex = start - 1;
        swap(array,pivot,end);
        for(int i=start;i<=end;i++){
            if(array[i]<=array[end]){
                smallIndex++;
                if(smallIndex < i ){
                    swap(array,i,smallIndex);
                }
            }
        }
        return smallIndex;
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    //堆排序
    public static int[] heap_Sort(int[] array){
        int len = array.length;
        if(len<1)
            return  array;
        buildMaxHeap(array,len);
        while(len>0){
            swap(array,0,len-1);
            len--;
            adjustHeap(array,0,len);

        }
        return array;
    }

    public static void buildMaxHeap(int[] array,int len){

        for(int i =array.length/2-1;i>=0;i--){
            adjustHeap(array, i,len);
        }

    }
    public static void adjustHeap(int[] array,int i,int len){
        int maxIndex = i;
        if((i*2 +1)<len && array[i*2+1]>array[maxIndex])
            maxIndex = i*2+1;
        if((i*2+2)<len&&array[i*2+2]>array[maxIndex])
            maxIndex = i*2+2;
        if(maxIndex != i){
            swap(array,maxIndex,i);
            adjustHeap(array,maxIndex,len);
        }
    }

    public static boolean IsPrime(int n){

        for (int i=2;i<=(int)Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }

}
