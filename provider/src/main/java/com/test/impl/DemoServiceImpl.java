package com.test.impl;

import com.test.Provider;

/**
 * Created by jieliyu on 2017/2/9.
 */
public class DemoServiceImpl implements Provider {
    public String build(String name) throws Exception {
        System.out.println(" got a argument: " + name);
        return "message from provider: " + name;
    }
}
