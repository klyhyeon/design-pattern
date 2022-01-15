package com.baekho.design.pattern.abstraction;

public class SocketDataReader implements ByteSource {
    @Override
    public byte[] read() {
        System.out.println("socket");
        return new byte[0];
    }
}
