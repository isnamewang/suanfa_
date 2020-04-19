/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution33
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 11:26
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution33 {




    public boolean VerifySquenceOfBST(int [] sequence) {

            if(sequence == null || sequence.length<=0)
                return false;
            return verify(sequence,0,sequence.length-1);

    }
    public  boolean verify(int[] sequence,int first,int last){
        if(last - first<=1)
            return true;
        int rootval = sequence[last];
        int cutIndex = first;
        while(cutIndex<last && sequence[cutIndex]<=rootval){
            cutIndex++;
        }
        for(int i=cutIndex;i<last;i++)
            if(sequence[i]<rootval)
                return false;
        return verify(sequence,first,cutIndex-1)&&verify(sequence,cutIndex,last-1);


    }

}
