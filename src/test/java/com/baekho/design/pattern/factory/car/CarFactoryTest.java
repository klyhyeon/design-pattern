package com.baekho.design.pattern.factory.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarFactoryTest {

    @Test
    @DisplayName("CarFactoryTest")
    void CarFactoryTest() {
        CarFactory carFactory = new HyundaiCarFactory();
        String carName = "sportage";
        Car newCar = carFactory.createCar(carName);
//        assertThat(newCar.carType).isEqualTo(carName);
//        carFactory.sellCar("sonata");
        String ownerName = "yuhyeon";
        Car myCar = carFactory.returnCar(ownerName);
        Car hisCar = carFactory.returnCar(ownerName);
        assertThat(myCar == hisCar).isTrue();
    }

}