import sun.security.util.Length;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution17
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/2 16:20
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/2      wusd          v1.0.0               修改原因
 */
public class Solution17 {




    public static void main(String[] args){

        print1ToMaxN(-1);

    }


        public static void print1ToMaxN_1(int n){

            if(n<=0)
                return;
            char[] num = new char[n];
            numset(num);
            for(int i=0;i<10;i++){
                num[0]=(char)('0'+i);
                printtoMAx(num,n,0);
            }
        }
        public static void printtoMAx(char[] num, int length,int index){

        if(index==length-1){
            printNumber(num);
            return;
        }
        for(int i=0;i<10;i++){
            num[index+1]=(char)('0'+i);
            printtoMAx(num,length,index+1);
        }

        }


        public static void print1ToMaxN(int n){
            if(n<0)
                return;
            char[] number = new char[n];
            numset(number);
            while(!increament(number)){
                printNumber(number);
            }


        }
        public  static void printNumber(char[] num){
            boolean isbenging0=true;
            for(int i=0;i<num.length;i++){
                if(isbenging0&&num[i]!='0')
                    isbenging0=false;
                if(!isbenging0)
                    System.out.print(num[i]);
            }
            System.out.print("\n");

        }
        public static boolean increament(char[] num){

            boolean isOver = false;
            int overlight = 0;
            for(int i=num.length-1;i>=0;i--){

                int sum = num[i]-'0'+overlight;
                if(i==num.length-1)
                    sum++;
                if(sum>=10){
                    if(i==0)
                        isOver=true;
                    else{
                        overlight=1;
                        sum = sum-10;
                        num[i]=(char)('0'+sum);
                    }
                }
                else {
                    num[i]=(char)('0'+sum);
                    break;
                }
            }
            return isOver;
        }





        public static void numset(char[] num){
            for(int i=0;i<num.length;i++){
                num[i]='0';
            }
        }


}
