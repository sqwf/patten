package com.panda.patten.protrotype.simple;

import java.util.List;

/**
 * @Description: 需要克隆的类
 * @Author: PanDa
 * @CreateDate: 2019/3/28 10:53
 * @Version: 1.0
 */
public class ConcreteProtrotypeA implements IProtrotype {

    private String name;
    private String sex;
    private List hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcreteProtrotypeA clone() {
        ConcreteProtrotypeA concreteProtrotypeA = new ConcreteProtrotypeA();
        concreteProtrotypeA.setName(this.name);
        concreteProtrotypeA.setSex(this.sex);
        concreteProtrotypeA.setHobbies(this.hobbies);
        return concreteProtrotypeA;
    }
}
