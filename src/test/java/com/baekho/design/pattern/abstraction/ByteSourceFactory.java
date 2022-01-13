package com.baekho.design.pattern.abstraction;

public class ByteSourceFactory {

    public ByteSource create() {
        if (useFile()) {
            return new FileDataReader();
        }
        return new SocketDataReader();
    }

    private boolean useFile() {
        //원래는 resource폴더 내 properties 파일에 저장되어 있어야 함
        //https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        System.setProperty("useFile", "true");

        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }

    private static ByteSourceFactory instance = new ByteSourceFactory();
    public static ByteSourceFactory getInstance() {
        return instance;
    }

    private ByteSourceFactory() {}
}
