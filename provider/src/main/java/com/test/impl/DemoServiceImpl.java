package com.test.impl;

import com.test.Provider;

/**
 *
 * @author jeff
 * @date 2017/2/9
 */
public class DemoServiceImpl implements Provider {
    @Override
    public String build(String name) throws Exception {
        System.out.println(" got a argument: " + name);
        return "message from provider: " + name;
    }
}
