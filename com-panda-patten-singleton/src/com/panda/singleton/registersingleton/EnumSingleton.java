package com.panda.singleton.registersingleton;

/**
 * @Description: 注册式单例模式---枚举
 * @Author: PanDa
 * @CreateDate: 2019/3/27 17:11
 * @Version: 1.0
 */
public enum EnumSingleton {
    INSTENCT;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstenct() {
        return INSTENCT;
    }
}
