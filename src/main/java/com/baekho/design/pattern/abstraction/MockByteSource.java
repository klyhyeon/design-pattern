package com.baekho.design.pattern.abstraction;

public class MockByteSource implements ByteSource {
    @Override
    public byte[] read() {
        return new byte[128];
    }
}
