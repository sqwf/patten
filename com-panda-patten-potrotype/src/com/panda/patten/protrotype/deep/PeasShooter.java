package com.panda.patten.protrotype.deep;

import java.io.*;
import java.util.Date;

public class PeasShooter extends Peas implements Cloneable, Serializable {
    public Shooter shooter;

    public PeasShooter() {
        this.birthday = new Date();
        this.shooter = new Shooter();
    }

    @Override
    protected Object clone() {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            PeasShooter cope = (PeasShooter) ois.readObject();
            cope.birthday = new Date();
            return cope;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public PeasShooter shallowClone(PeasShooter target) {
        PeasShooter peasShooter = new PeasShooter();
        peasShooter.height = target.height;
        peasShooter.weight = target.weight;
        peasShooter.shooter = target.shooter;
        peasShooter.birthday =new Date();

        return peasShooter;

    }

}
