import java.util.ArrayList;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution57
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/14 16:33
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/14      wusd          v1.0.0               修改原因
 */
public class Solution57 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> sq = new ArrayList<>();
        if(array==null || array.length<2)
            return sq;
        int small=0,big=array.length-1;
        int curtSum = array[small]+array[big],index1=-1,index2=-1;
        int muSum = 0,count=0;
        while(small<big){
            if(curtSum==sum){
                if(count==0){
                    muSum=array[small]*array[big];
                    count++;
                    index1=small;
                    index2=big;
                }
                if(muSum>array[small]*array[big]&&count>0){
                    muSum=array[small]*array[big];
                    index1=small;
                    index2=big;
                }
            }else if(curtSum>sum){
                big--;
            }else{
                small++;
            }
        }
        if(index1!=-1&&index2!=-1){
            sq.add(array[index1]);
            sq.add(array[index2]);
        }
        return sq;
    }



    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> sequences = new ArrayList<>();
        if(sum<3)
            return sequences;
        int small=1,big=2;
        int middle = (1+sum)/2;
        int curtSum=small+big;
        while (small<middle){

            if(curtSum==sum){
                sequences.add(GetSequence(small,big));
            }
            while(curtSum>sum&&small<middle){
                curtSum=curtSum-small;
                small++;
                if(curtSum==sum)
                    sequences.add(GetSequence(small,big));
            }
            big++;
            curtSum=curtSum+big;
        }
        return sequences;
    }
    private ArrayList<Integer> GetSequence(int small,int big){
        ArrayList<Integer> sq = new ArrayList<>();
        for(int i=small;i<=big;i++)
            sq.add(i);
        return sq;
    }

}
