package com.baekho.design.pattern.singleton;

import java.util.Objects;

public class ConnectionPool {

//    private static ConnectionPool instance = new ConnectionPool();

    private ConnectionPool() {}

    private static class ConnectionPoolHolder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }

    public static ConnectionPool getInstance() {
        return ConnectionPoolHolder.INSTANCE;
    }
}
