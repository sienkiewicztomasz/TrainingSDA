package pl.sda.gofpatterns.creational.factoryMethod.structural.proxy;

import java.util.List;



public class BasketLoggerProxy implements Basket{

    private final Client client;

    private final Basket basket;



    public BasketLoggerProxy(Client client, Basket basket) {

        this.client = client;

        this.basket = basket;

    }



    @Override

    public void addProduct(Product product) {

        basket.addProduct(product);

    }



    @Override

    public void removeProduct(Product product) {

        basket.removeProduct(product);

        logRemoveAction(product);

    }



    private void logRemoveAction(Product product) {

        System.out.println("zapisujemy do bazy usuniecie produktu...");

        System.out.println("usunieto id: "+ product.getId() +

                ", przez: "

                + client.getName());

        System.out.println("zakonczono zapisywanie do bazy");

    }



    @Override

    public List<Product> getProducts() {

        return basket.getProducts();

    }

}
