package com.palantir.code.ts.generator.examples;

/**
 * Note that MyObject is jackson serializable
 */
public class MyObject {
    private String payload = "hello world";

    public String getPayload() {
        return payload;
    }
}
