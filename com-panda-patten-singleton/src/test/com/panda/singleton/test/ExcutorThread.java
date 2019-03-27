package test.com.panda.singleton.test;

import com.panda.singleton.lazysingleton.LazyDoubleCheckSingleton;
import com.panda.singleton.lazysingleton.LazySingleton;

public class ExcutorThread implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstence();
        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstence();
        System.out.println(Thread.currentThread().getName() + ":" + lazySingleton);
    }
}
