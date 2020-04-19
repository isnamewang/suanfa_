/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution8
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/29 22:02
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/29      wusd          v1.0.0               修改原因
 */
public class Solution8 {

   public static class BinaryTreeNode{

       BinaryTreeNode left;
       BinaryTreeNode right;
       BinaryTreeNode father;
       char val;
       BinaryTreeNode(char val){
           this.val=val;
       }
   }



   public static BinaryTreeNode getNext(BinaryTreeNode node){

       if(node == null)
           return null;
       BinaryTreeNode pNext = null;

       if(node.right != null){
           BinaryTreeNode pRight = node.right;
           while(pRight.left != null){
               pRight = pRight.left;
           }
           pNext = pRight;
       }
       else if(node.father != null){
           BinaryTreeNode current=node;
           BinaryTreeNode father = node.father;
           while(father != null && current==father.right){
               current = father;
               father = father.father;
           }
           pNext = father;
       }

       return  pNext;
   }




}
