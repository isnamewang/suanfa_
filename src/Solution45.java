import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Solution45
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/13 10:28
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/13      wusd          v1.0.0               修改原因
 */
public class Solution45 {


    public String PrintMinNumber(int [] numbers) {

        ArrayList<String> arrayList = new ArrayList<>();
        for(int num:numbers)
            arrayList.add(num+"");
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=0,j=0;
                while(i<o1.length()||j<o2.length()){
                    if(i==o1.length())i=i-o1.length();
                    if(j==o2.length())j=j-o2.length();
                    if(o1.charAt(i)>o2.charAt(j))
                        return 1;
                    else if(o1.charAt(i)<o2.charAt(j))
                        return -1;
                    i++;
                    j++;
                }
                return 0;
            }
        });
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<arrayList.size();i++)
                stringBuilder.append(arrayList.get(i));
            return stringBuilder.toString();
    }
}
