package pl.sda.gofpatterns.creational.factoryMethod.creational.builder;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


public class AmericanVehicleBuilder implements VehicleBuilder {

    private int size;

    private List<Wheel> wheelList = new ArrayList<Wheel>();

    public Vehicle build() {

        ArrayList<Wheel> list = new ArrayList<Wheel>(wheelList);

        List<Wheel> wheel = Collections.unmodifiableList(list);

        return new Vehicle(size, wheel);

    }


    public VehicleBuilder addWheel() {

        wheelList.add(new Wheel(23));

        return this;

    }


    public VehicleBuilder setTank(int size) {

        this.size = size * 2;

        return this;

    }

}
