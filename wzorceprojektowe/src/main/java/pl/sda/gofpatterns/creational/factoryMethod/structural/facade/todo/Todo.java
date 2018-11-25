package pl.sda.gofpatterns.creational.factoryMethod.structural.facade.todo;

class Todo implements Containing {

    private final String value;


    Todo(String value) {

        this.value = value;

    }


    public String getContent() {

        return value;

    }

}