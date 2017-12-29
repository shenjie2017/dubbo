package com.blue.dubbo.service.impl;

import com.blue.dubbo.api.service.RandomService;

import java.util.Random;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/6
 */
public class RandomServiceImpl implements RandomService {
    @Override
    public Random getRandom() {
        return new Random();
    }

    @Override
    public int getRandomInt() {
        return new Random().nextInt();
    }
}
