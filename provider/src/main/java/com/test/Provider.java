package com.test;

/**
 *
 * @author jieliyu
 * @date 2017/2/9
 */
public interface Provider {
    String build(String name) throws Exception;
}
