package test.com.panda.patten.protrotype.simple;

import com.panda.patten.protrotype.simple.Client;
import com.panda.patten.protrotype.simple.ConcreteProtrotypeA;

import java.util.ArrayList;
import java.util.List;

public class SimpleProtrotypeTest {
    public static void main(String[] args) {
        ConcreteProtrotypeA concreteProtrotype = new ConcreteProtrotypeA();
        concreteProtrotype.setName("雷锋");
        concreteProtrotype.setName("男");
        List hobbies = new ArrayList();
        hobbies.add("帮助别人");
        concreteProtrotype.setHobbies(hobbies);

        Client client = new Client();
        ConcreteProtrotypeA   concreteProtrotype2= (ConcreteProtrotypeA)client.startClone(concreteProtrotype);

        System.out.println(concreteProtrotype);
        System.out.println(concreteProtrotype2);

        System.out.println(concreteProtrotype.getHobbies());
        System.out.println(concreteProtrotype2.getHobbies());
        System.out.println(concreteProtrotype.getHobbies()==concreteProtrotype2.getHobbies());

    }
}
