import java.util.Arrays;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.testSort
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/2 9:09
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/2      wusd          v1.0.0               修改原因
 */
public class testSort {



    public static void main(String[] args){
        int[] str = {1,58,56,23,1,5,8,9,56,12,45,5,8};
        heap_Max(str,str.length);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }


    //冒泡
    public static void bubble(int [] str){

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                if(str[j+1]<str[j]){
                    int temp = str[j+1];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
    }
    //选择
    public static void selection_Sort(int[] str){

        for(int i=0;i<str.length;i++){
            int minIndex=i;
            for(int j=i;j<str.length;j++){
                if(str[minIndex]>str[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp = str[i];
                str[i]=str[minIndex];
                str[minIndex]=temp;
            }
        }
    }
    //插入
    public static void insert_Sort(int[] str){

        int current,preIndex;
        for(int i=0;i<str.length-1;i++){
            current = str[i+1];
            preIndex=i;
            while (preIndex>=0&&current<str[preIndex]){
                str[preIndex+1]=str[preIndex];
                preIndex--;
            }
            str[preIndex+1]=current;
        }
    }
    //快排
    public static void quick_Sort(int[] str,int start,int end){

        int index = partition(str,start,end);
        if(index>start){
             quick_Sort(str,start,index-1);
        }
        if(index<end){
             quick_Sort(str,index+1,end);
        }

    }
    public static int partition(int[] str,int start,int end){

        int pivot =  start+ (int)(Math.random()*(end-start+1));
        swap(str,pivot,end);
        int smallIndex = start-1;
        for(int i=start;i<=end;i++){
            if(str[i]<=str[end]){
                smallIndex++;
                if(smallIndex!=i){
                    swap(str,smallIndex,i);
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
    public static void heap_Max(int[] str,int len){

        for(int i=len/2-1;i>=0;i--){
            adjust(str,i,len);
        }
        while(len>0){
            swap(str,0,len-1);
            len--;
            adjust(str,0,len);
        }

    }

    public static void adjust(int[] str,int i,int len){
        int maxIndex = i;
        if((2*i+1)<len&&str[2*i+1]>str[maxIndex])
            maxIndex = 2*i+1;
        if((2*i+2)<len&&str[2*i+2]>str[maxIndex])
            maxIndex = 2*i+2;
        if(maxIndex !=i){
           swap(str,i,maxIndex);
           adjust(str,maxIndex, len);
        }
    }

    //归并
    /*public static int[] merge_Sort(int[] str){
        if(str.length<2)
            return  str;
        int middle = str.length / 2;
        int[] left = Arrays.copyOfRange(str,0, middle);
        int[] right = Arrays.copyOfRange(str,middle,str.length);
        return merge(merge_Sort(left),merge_Sort(right));
    }
    public static int[] merge(int[] left,int[] right){

        int[] result = new int[left.length+right.length];
        for(int index=0,i=0,j=0;index<result.length;index++){

            if(i>=left.length)
                result[index]=right[j++];
            else if(j>=right.length)
                result[index]=left[i++];
            else if(left[i]>=right[j])
                result[index]=right[j++];
            else
                 result[index]=left[i++];
            return result;

        }

    }*/




}
