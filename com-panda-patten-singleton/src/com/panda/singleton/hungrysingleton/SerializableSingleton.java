package com.panda.singleton.hungrysingleton;


import java.io.Serializable;

/**
 * @Description: 防止反序列破坏单例
 * @Author: PanDa
 * @CreateDate: 2019/3/27 16:38
 * @Version: 1.0
 */
public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton INSTENCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTENCE;
    }

    //重写这个方法防止序列化破坏
    private Object readResolve() {
        return INSTENCE;
    }

}
