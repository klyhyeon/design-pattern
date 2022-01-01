package com.baekho.design.pattern.factory.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HyundaiCarFactoryTest {

    @Test
    @DisplayName("HyundaiCarFactoryTest")
    void HyundaiCarFactoryTest() {
        HyundaiCarFactory carFactory = new HyundaiCarFactory();
        String ownerName = "yuhyeon";
        Car newCar = carFactory.returnCar(ownerName);
        assertThat(newCar).isNotNull();
    }

}