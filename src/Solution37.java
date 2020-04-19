import sun.reflect.generics.tree.Tree;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution37
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/10 18:13
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/10      wusd          v1.0.0               修改原因
 */
public class Solution37 {


    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private String str;

    public String Serialize(TreeNode root){
        if(root == null)
            return "#";

        return root.val+","+Serialize(root.left)+","+Serialize(root.right);

    }
    public TreeNode Deserialize(String str1){
        this.str=str1;
        return Deserialize();
    }

    public TreeNode Deserialize(){

        if(str.length()==0)
            return null;
        int index = str.indexOf(",");
        String node =index==-1?str :str.substring(0,index);
        str = index==-1?"":str.substring(index+1);
        if(node =="#")
            return null;
        int val = Integer.valueOf(node);
        TreeNode t = new TreeNode(val);
        t.left = Deserialize();
        t.right = Deserialize();
        return t;
    }





}
