/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution13
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/30 16:56
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/30      wusd          v1.0.0               修改原因
 */
public class Solution13 {


    public static int movingCount(int k,int rows,int cols){

        if(k<0 || rows <=0 || cols <=0)
            return 0;
        boolean[][] visited = new boolean[rows][cols];

        int count =movingCountCore(k,rows,cols,0,0,visited);
        return count;
    }

    private static int movingCountCore(int k,int rows,int cols,int row,int col,boolean[][] visited){
        int count = 0;
        if(check(k,rows, cols, row, col, visited)){
            visited[row][col]=true;
            count = 1 + movingCountCore(k,rows,cols,row+1,col,visited)
                    + movingCountCore(k,rows,cols,row-1,col,visited)
                    + movingCountCore(k,rows,cols-1,row,col,visited)
                    + movingCountCore(k,rows,cols+1,row,col,visited);
        }
        return count;
    }

    private static boolean check(int k,int rows,int cols,int row,int col,boolean[][] visited){
        if(row >= 0 && row < rows && col >= 0 && col <cols &&
                !visited[row][col] && getDigitSum(row) + getDigitSum(col)<=k){

            return true;
        }
        return false;
    }
    private  static int getDigitSum(int number){

        int sum = 0;
        while(number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }

        return  sum;
    }





}
