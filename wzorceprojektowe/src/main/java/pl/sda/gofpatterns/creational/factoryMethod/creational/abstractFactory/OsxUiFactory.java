package pl.sda.gofpatterns.creational.factoryMethod.creational.abstractFactory;

class OsxUiFactory implements UiAbstractFactory {

    public Button getButton() {

        return new OsxButton();

    }


    public Input getInput() {

        return new OsxInput();

    }

}
