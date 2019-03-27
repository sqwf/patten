package com.panda.singleton.lazysingleton;

/**
 * @Description: 懒汉式单例模式
 * @Author: PanDa
 * @CreateDate: 2019/3/27 15:04
 * @Version: 1.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() { }
    //调用的时候才开始加载
    //加入synchronized关键字保证线程安全
    public synchronized static  LazySingleton getInstence() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
