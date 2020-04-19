import sun.reflect.generics.tree.Tree;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution7
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/25 18:06
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/25      wusd          v1.0.0               修改原因
 */
public class Solution7 {

    public static class  TreeNode{
        int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x){
           val=x;
       }
    }
    private static int[] pre={1,2,4,7,3,5,6,8};
    private static int[] in = {4,7,2,1,5,3,8,6};

    public static void main(String[] args){
        TreeNode BinTree = ReConstructTree(pre, in);
        System.out.println("Over");
        preOrder(BinTree);
    }


    public static void preOrder(TreeNode BinTree){
        if(BinTree == null)
            return;
        System.out.println(BinTree.val);
        preOrder(BinTree.left);
        preOrder(BinTree.right);
    }


    public static TreeNode ReConstructTree(int[] pre , int[] in){

        TreeNode BinTree = new TreeNode(pre[0]);
        int flag = 0;
        int head = 0;
        int tail = pre.length-1;
        int root = Find(pre[0]);
        if(root != -1){
            ReConstructSolution(BinTree,flag,head,tail,root);
        }

        return BinTree;

    }

    private static void ReConstructSolution(TreeNode tree,int flag,int head,int tail,int root){
        //有左子树和右子树
        if(root != head && root !=tail){
            int leftroot = pre[flag+1];
            tree.left = new TreeNode(leftroot);
            ReConstructSolution(tree.left, flag+1, head, root-1, Find(leftroot));

            int rightroot= pre[flag+(root-head)+1];
            tree.right = new TreeNode(rightroot);
            ReConstructSolution(tree.right, flag+(root-head)+1,root+1, tail, Find(rightroot));
        }//只有左子树
        else if(root != head && root == tail){
            int leftroot = pre[flag+1];
            tree.left = new TreeNode(leftroot);
            ReConstructSolution(tree.left, flag+1, head, root-1,Find(leftroot) );
        }//只有右子树
        else if(root == head && root != tail){
            int rightroot = pre[flag+(root-head)+1];
            tree.right = new TreeNode(rightroot);
            ReConstructSolution(tree.right, flag+(root-head)+1, root+1, tail, Find(rightroot));
        }
    }

    private static int Find(int data){

        for(int i = 0;i<in.length;i++){
            if(in[i]==data)
                return i;
        }
        return -1;
    }


}
