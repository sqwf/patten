package com.panda.singleton.registersingleton;

/**
* @Description:    ThreadLocal 线程单例
* @Author:         PanDa
* @CreateDate:     2019/3/27 17:35
* @Version:        1.0
*/
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingletonThreadLocal.get();
    }
}
