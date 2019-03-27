package com.panda.singleton.lazysingleton;

/**
 * @Description: 懒汉式单例模式---双重锁
 * @Author: PanDa
 * @CreateDate: 2019/3/27 15:04
 * @Version: 1.0
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    //调用的时候才开始加载
    //双重检索锁  -----进行两次判断
    public static LazyDoubleCheckSingleton getInstence() {

        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
