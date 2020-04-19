/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.Singleton
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/3/22 16:52
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/3/22      wusd          v1.0.0               修改原因
 */
public final class Singleton {

    private static Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getSingletoInstance(){

        synchronized(Singleton.class) {

            if (singleton == null){
                singleton = new Singleton();
            }
        }
        return singleton;
    }


}
