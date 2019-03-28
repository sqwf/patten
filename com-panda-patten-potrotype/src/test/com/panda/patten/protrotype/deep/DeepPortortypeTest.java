package test.com.panda.patten.protrotype.deep;

import com.panda.patten.protrotype.deep.PeasShooter;

public class DeepPortortypeTest {
    public static void main(String[] args) {
        PeasShooter peasShooter = new PeasShooter();
        PeasShooter clone =(PeasShooter) peasShooter.deepClone();
        System.out.println("深克隆："+(peasShooter.shooter==clone.shooter));

        PeasShooter simple = peasShooter.shallowClone(peasShooter);
        System.out.println("浅克隆："+(peasShooter.shooter==simple.shooter));

    }
}
