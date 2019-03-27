package test.com.panda.singleton.test;

public class LazySingletonTest {
    public static void main(String[] args) {
//        System.out.println(LazySingleton.getInstence());
//        System.out.println(LazySingleton.getInstence());
//        System.out.println(LazySingleton.getInstence());

        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());
        t1.start();
        t2.start();

        System.out.println("end");
    }

}
