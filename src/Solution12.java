/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution12
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 16:12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution12 {


    public static void main(String[] args){
            char[][] martix = {{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
            String str = "abfc";
            System.out.println(hasPath(martix, martix.length, martix[0].length,str));

    }
    /*
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(str == null || str.length<=0 || matrix == null)
            return false;
        boolean[][] visited = new boolean[rows][cols];
        int pathIndex=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(hasPathCore(matrix,rows,cols,i,j,pathIndex,str,visited))
                    return true;
            }
        }
        return false;
    }
    private boolean hasPathCore(char[]martix,int rows,int cols,
                                int row,int col,int pathIndex,char[]str,boolean[][]visited){
        boolean hasPath=false;
        if(pathIndex==str.length)
            return true;
        if(row>=0&&row<rows&&col>=0&&col<cols&&!visited[row][col]
                &&martix[row*cols+col]==str[pathIndex]){
            pathIndex++;
            visited[row][col]=true;
            hasPath=hasPathCore(martix,rows,cols,row+1,col,pathIndex,str,visited)
                    ||hasPathCore(martix,rows,cols,row-1,col,pathIndex,str,visited)
                    ||hasPathCore(martix,rows,cols,row,col+1,pathIndex,str,visited)
                    ||hasPathCore(martix,rows,cols,row,col-1,pathIndex,str,visited);
            if(!hasPath){
                pathIndex--;
                visited[row][col]=false;
            }
        }
        return hasPath;
    }*/


    public static boolean hasPath(char[][] martix,int rows,int cols,String str){

        if(martix == null || rows < 0 || cols < 0 || str == null)
            return false;
        boolean[][] visited = new boolean[rows][cols];
        init(visited);
        Integer pathIndex = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(hasPathCore(martix,rows,cols,i,j,pathIndex,str,visited)){
                    return true;
                }

            }
        }

        return false;
    }
    private static boolean hasPathCore(char[][] martix,int rows,int cols,int row,int col,
                                Integer pathIndex,String str,boolean[][] visited){

        boolean hasPath = false;
        if(pathIndex == str.length())
            return true;
        if(row >= 0 && row <rows && col >= 0 && col<cols
                &&martix[row][col]==str.charAt(pathIndex)&&!visited[row][col]) {
            pathIndex++;
            visited[row][col] = true;
            hasPath = hasPathCore(martix, rows, cols, row, col - 1, pathIndex, str, visited)
                    || hasPathCore(martix, rows, cols, row, col + 1, pathIndex, str, visited)
                    || hasPathCore(martix, rows, cols, row - 1, col, pathIndex, str, visited)
                    ||  hasPathCore(martix, rows, cols, row+1, col, pathIndex, str, visited);
             if(!hasPath){
                 pathIndex --;
                 visited[row][col]=false;
             }
        }
        return hasPath;
    }
    private static void init(boolean[][] visited){
        for(int i=0;i<visited.length;i++){
            for(int j = 0;j<visited[0].length;j++){
                visited[i][j]=false;
            }
        }
    }





}
