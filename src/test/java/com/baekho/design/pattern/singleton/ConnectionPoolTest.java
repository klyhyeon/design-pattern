package com.baekho.design.pattern.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConnectionPoolTest {

    @Test
    @DisplayName("SingletonPattern")
    void singletonPatternTest() {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();
        assertThat(instance1 == instance2).isTrue();
    }

}