package pl.sda.gofpatterns.creational.factoryMethod.creational.abstractFactory;

class WindowsUiFactory implements UiAbstractFactory {

    public Button getButton() {

        return new WindowsButton();

    }


    public Input getInput() {

        return new WindowsInput();

    }

}
