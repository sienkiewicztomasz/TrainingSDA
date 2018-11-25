package pl.sda.gofpatterns.creational.factoryMethod.structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {

        Basket basket = new RealBasket();

        Client client = new Client(basket);

        client.setName("Przemek");

        client.shopping();

        basket.getProducts()

                .forEach(System.out::println);

    }

}