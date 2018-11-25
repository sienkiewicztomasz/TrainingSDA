package pl.sda.gofpatterns.creational.factoryMethod.creational.builder;


public class Wheel {

    private final int size;


    public Wheel(int size) {

        this.size = size;

    }


    public int getSize() {

        return size;

    }


    @Override

    public String toString() {

        return "Wheel{" +

                "size=" + size +

                '}';

    }

}



