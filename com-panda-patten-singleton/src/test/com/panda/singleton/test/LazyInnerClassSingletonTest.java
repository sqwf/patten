package test.com.panda.singleton.test;

import com.panda.singleton.lazysingleton.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clzz = LazyInnerClassSingleton.class;
            //拿到LazyInnerClassSingleton的构造函数
            Constructor constructor = clzz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            //调用两次构造方法
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
