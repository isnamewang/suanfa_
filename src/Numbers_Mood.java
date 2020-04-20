import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Numbers_Mood
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/20 11:43
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/20      wusd          v1.0.0               修改原因
 */
public class Numbers_Mood {



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            long n = in.nextLong();
            int flag = Type_Number(n);
            if(flag==0)
                System.out.println("S");
            if(flag==1)
                System.out.println("H");
            if(flag==2)
                System.out.println("G");
        }
    }
    public static int Type_Number(long number){
        int length=0,count=0;
        long number1=number;
        while(number1!=0){
            long temp = number1%10;
            length++;
            if( temp == 0||number%temp==0)
                count++;
            number1 = number1/10;
        }
        if(count==0)
            return 0;
        if(count<length)
            return 1;
        return 2;
    }


}
