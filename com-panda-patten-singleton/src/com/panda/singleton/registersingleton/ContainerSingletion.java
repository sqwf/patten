package com.panda.singleton.registersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 容器注册式单例
 * @Author: PanDa
 * @CreateDate: 2019/3/27 17:19
 * @Version: 1.0
 */
public class ContainerSingletion {
    private ContainerSingletion() { }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String clssName) {
        synchronized (ioc){
            if (!ioc.containsKey(clssName)) {
                Object obj = null;
                try {
                    obj = Class.forName(clssName).newInstance();
                    ioc.put(clssName, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(clssName);
            }
        }

    }
}
