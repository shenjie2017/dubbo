package com.blue.dubbo.api.service;

import java.util.Random;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/6
 */
public interface RandomService {
    /**
     * 获取随机数对象
     * @return
     */
    Random getRandom();

    int getRandomInt();
}
