package com.panda.singleton.hungrysingleton;

/**
 * @Description: 基本饿汉式单例模式
 * @Author: PanDa
 * @CreateDate: 2019/3/27 14:48
 * @Version: 1.0
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstence() {
        return hungrySingleton;
    }
}
