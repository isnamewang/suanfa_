import com.sun.java.swing.plaf.windows.WindowsTableHeaderUI;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution40
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/1 14:49
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/1      wusd          v1.0.0               修改原因
 */
public class Solution40 {


    public static void main(String[] args){
        int[] s = {1,2,3,4};
        Solution40 s1 = new Solution40();
        s1.GetLeastNumbers_Solution(s,4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        if(k>input.length||k<=0)
            return result;
        FindSmall_K(input,k-1);
        for(int i=0;i<k;i++)
            result.add(input[i]);
        return result;
    }
    public void FindSmall_K(int[] nums,int k){
        int start=0,end = nums.length-1;
        while(end>start){
            int i = Partition(nums,start,end);
            if(i==k)
                break;
            if(i>k)
                end = i-1;
            else
                start = i+1;
        }
    }

    public int Partition(int[] nums,int start,int end){

        int indexRandom = start+(int)(Math.random()*(end-start+1));
        Swap(nums,indexRandom,end);
        int min=start,max=end-1;
       //int t = nums[end];
       //System.out.println(nums[end]);
        while (max>min){
            while (max>=start&&nums[max]>=nums[end])
                max--;
            while (min<end&&nums[min]<nums[end])
                min++;
            if(max>min)
                Swap(nums,min,max);
        }
        Swap(nums,max+1,end);
        return max+1;
    }
    public void Swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }





}
