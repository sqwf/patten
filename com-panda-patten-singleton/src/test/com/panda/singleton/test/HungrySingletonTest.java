package test.com.panda.singleton.test;

import com.panda.singleton.hungrysingleton.HungrySingleton;
import com.panda.singleton.hungrysingleton.HungryStaticSingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstence());
        System.out.println(HungrySingleton.getInstence());
        System.out.println(HungrySingleton.getInstence());
        System.out.println(HungryStaticSingleton.getInstence());
        System.out.println(HungryStaticSingleton.getInstence());
        System.out.println(HungryStaticSingleton.getInstence());

    }
}
