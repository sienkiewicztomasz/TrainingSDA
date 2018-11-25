package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.abstraction;

public abstract class Printer {


    public void print() {

        prepareDocument();

        loadPaper();

        loadInk();

        printDocument();

    }


    protected abstract void printDocument();


    protected abstract void loadInk();


    protected abstract void loadPaper();


    protected abstract void prepareDocument();

}