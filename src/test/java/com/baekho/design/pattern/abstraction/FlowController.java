package com.baekho.design.pattern.abstraction;

public class FlowController {

    public static void main(String[] args) {
        ByteSource source = ByteSourceFactory.getInstance().create();
        source.read();
    }
}
