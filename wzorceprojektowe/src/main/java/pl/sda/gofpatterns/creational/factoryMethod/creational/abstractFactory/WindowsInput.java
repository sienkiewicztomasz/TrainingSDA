package pl.sda.gofpatterns.creational.factoryMethod.creational.abstractFactory;

class WindowsInput implements Input {

    private StringBuilder stringBuilder = new StringBuilder();

    public void write(String value) {

        stringBuilder.append(value);

    }


    public String getText() {

        return stringBuilder.toString();

    }

}
