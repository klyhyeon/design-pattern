package com.baekho.design.pattern.abstraction;

public class FlowController {

    private ByteSource byteSource;

    public FlowController(ByteSource byteSource) {
        this.byteSource = byteSource;
    }

    public void process() {
//        ByteSource source = ByteSourceFactory.getInstance().create();
//        source.read();
        //for test code
        byteSource.read();
    }
}
