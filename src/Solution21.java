/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution21
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/3 9:22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/3      wusd          v1.0.0               修改原因
 */
public class Solution21 {


    public static void main(String[] args){
        int[] num = {1,5,8,4,9,6,78,56,55,54,52,51};
        reOrderArray(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    public static void reOrderArray(int[] num){

        if(num == null || num.length == 0)
            return;
        int jIndex=0;
        int oIndex = num.length-1;
        while(oIndex >jIndex){

            while(jIndex<oIndex&&(num[jIndex]&1)!=0){
                jIndex++;
            }
            while ((oIndex>jIndex)&&(num[oIndex]&1)==0){
                oIndex--;
            }
            if(jIndex<oIndex){
                swap(num,jIndex,oIndex);
            }
        }


    }
    public static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i]=num[j];
        num[j]=temp;
    }

}
