package com.baekho.design.pattern.factory.car;

import java.util.HashMap;
import java.util.Objects;

public class HyundaiCarFactory extends CarFactory {

    HashMap<String, Car> ownerCarMap = new HashMap<>();

    @Override
    public Car createCar(String name) {
        if (new Sportage().carType.equals(name)) {
            return new Sportage();
        }
        return new Sonata();
    }

    @Override
    public Car returnCar(String name) {
        if (Objects.isNull(ownerCarMap.get(name))) {
            Car newCar = createCar("sonata");
            ownerCarMap.put(name, newCar);
            return newCar;
        }
        return ownerCarMap.get(name);
    }
}
