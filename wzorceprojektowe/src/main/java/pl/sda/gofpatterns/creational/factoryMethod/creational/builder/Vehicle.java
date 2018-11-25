package pl.sda.gofpatterns.creational.factoryMethod.creational.builder;

import java.util.List;

public class Vehicle {
    private final int tankSize;

    public Vehicle(int tankSize, List<Wheel> wheel) {
        this.tankSize = tankSize;
        this.wheel = wheel;
    }

    private final List<Wheel> wheel;

}
