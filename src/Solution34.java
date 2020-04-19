import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution34
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 16:16
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution34 {

   static class TreeNode {
       int val = 0;
       TreeNode left = null;
       TreeNode right = null;

       public TreeNode(int val) {
           this.val = val;

       }
   }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<TreeNode> path = new Stack<>();
        int currentSum=0;
        if(root == null)
            return result;
        FindPath(root,target,result,path,currentSum);
        return  result;

    }
    public void FindPath(TreeNode root,int target,ArrayList<ArrayList<Integer>>result,Stack<TreeNode> path,int currentSum){

       currentSum = currentSum + root.val;
       path.push(root);
       if(currentSum ==target && root.left == null && root.right==null){
           ArrayList<Integer> onePath = new ArrayList<>();
           for(int i=0;i<path.size();i++){
               onePath.add(path.get(i).val);
           }
           result.add(onePath);

       }
       if(root.left!=null)
           FindPath(root.left,target,result,path,currentSum);
       if(root.right!=null)
           FindPath(root.right,target,result,path,currentSum);
        path.pop();
    }




}
