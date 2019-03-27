package com.panda.singleton.hungrysingleton;

/**
 * @Description: 静态代码块饿汉式单例模式
 * @Author: PanDa
 * @CreateDate: 2019/3/27 14:48
 * @Version: 1.0
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton ;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstence() {
        return hungrySingleton;
    }
}
