package pl.sda.gofpatterns.creational.factoryMethod.structural.proxy;

public class Client {

    private final Basket basket;

    private String name;


    public Client(Basket basket) {

        this.basket = new BasketLoggerProxy(this, basket);

    }


    public void shopping() {

        basket.addProduct(new Product("1", "Suszarka"));

        basket.removeProduct(new Product("1", "Suszarka"));

        basket.addProduct(new Product("2", "Piwo"));

        basket.addProduct(new Product("2", "Piwo"));

        basket.addProduct(new Product("2", "Piwo"));

        basket.addProduct(new Product("2", "Piwo"));

        basket.addProduct(new Product("3", "Kinderek"));

        basket.removeProduct(new Product("3", "Kinderek"));

        basket.addProduct(new Product("2", "Piwo"));

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }

}