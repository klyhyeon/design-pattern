package com.baekho.design.pattern.abstraction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowControllerTest {

    @Test
    @DisplayName("process_test")
    void process_test() {
        ByteSource mock = new MockByteSource();
        FlowController fc = new FlowController(mock);
        fc.process();
    }
}