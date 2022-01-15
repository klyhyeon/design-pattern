package com.baekho.design.pattern.abstraction;

public class FileDataReader implements ByteSource {
    @Override
    public byte[] read() {
        System.out.println("fileData");
        return new byte[0];
    }
}
