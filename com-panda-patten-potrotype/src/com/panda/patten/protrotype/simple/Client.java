package com.panda.patten.protrotype.simple;

/**
 * @Description: 模拟客户端
 * @Author: PanDa
 * @CreateDate: 2019/3/28 10:53
 * @Version: 1.0
 */
public class Client {
    public IProtrotype startClone(IProtrotype protrotype) {
        return protrotype.clone();
    }
}
