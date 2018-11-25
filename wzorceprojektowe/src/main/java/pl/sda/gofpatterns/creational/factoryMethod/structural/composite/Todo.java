package pl.sda.gofpatterns.creational.factoryMethod.structural.composite;

public class Todo implements Containing {

    private final String value;


    public Todo(String value) {

        this.value = value;

    }


    @Override

    public String getContent() {

        return value;

    }

}
