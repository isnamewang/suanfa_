/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution53
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 22:15
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution53 {


    public static void main(String[] args){
        int[]array = {2,2,4,4,4};
        Solution53 s = new Solution53();
        System.out.println(s.GetNumberOfK(array,3));
    }
    public int GetNumberOfK(int [] array , int k) {
        int first,last,number=0;
        if(array!=null && array.length!=0){
            System.out.println(array.length-1);
            first = GetFirst_K(array,k,0,4);
            last = GetLast_K(array,k,0,array.length-1);
            System.out.println(first+" "+last);
            if(first>-1&&last>-1)
                number=last-first+1;
        }
        return number;
    }


    private int GetFirst_K(int[] array,int k,int start,int end){
        if(start>end)
            return -1;
        int middleIndex = (start+end)/2;
        int middleData = array[middleIndex];
        if(middleData == k){
            if((middleIndex>0&&array[middleIndex-1]!=k) ||middleIndex==0){
                return middleIndex;
            }else{
                end = middleIndex-1;
            }
        }else if(middleData < k){
            start = middleIndex+1;
        }else{
            end = middleIndex-1;
        }
        return GetFirst_K(array,k,start,end);
    }
    private int GetLast_K(int[] array,int k,int start,int end){
        if(start>end)
            return -1;
        int middleIndex = (end+start)/2;
        int middleData = array[middleIndex];
        if(middleData==k){
            if(middleIndex==end|| (middleIndex<end&&array[middleIndex+1]!=k)
                ){
                return middleIndex;
            }else{
                start=middleIndex+1;
            }
        }else if(middleData <k){
            start = middleIndex+1;
        }else{
            end = middleIndex-1;
        }
        return GetLast_K(array,k,start,end);
    }

}
