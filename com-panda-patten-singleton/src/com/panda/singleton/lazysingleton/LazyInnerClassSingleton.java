package com.panda.singleton.lazysingleton;

/**
 * @Description: 静态内部类
 * @Author: PanDa
 * @CreateDate: 2019/3/27 15:59
 * @Version: 1.0
 */
public class LazyInnerClassSingleton {
//    private LazyInnerClassSingleton() {}
    //加入判断防止反射强行入侵
    private LazyInnerClassSingleton() {
        if (LazyClass.LAZY==null){
            throw  new RuntimeException("还想反射进来？走正常逻辑可好");
        }
    }

    //1.单例空间共享
    //2.保证不会被重写/覆盖
    public static final LazyInnerClassSingleton getInstance() {
        return LazyClass.LAZY;
    }

    //默认不加载
    private static class LazyClass {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
