package pl.sda.gofpatterns.creational.factoryMethod.structural.proxy;

import java.util.ArrayList;

import java.util.List;


public class RealBasket implements Basket {

    private List<Product> products = new ArrayList<>();

    @Override

    public void addProduct(Product product) {

        products.add(product);


    }


    @Override

    public void removeProduct(Product product) {

        products.remove(product);

    }


    @Override

    public List<Product> getProducts() {

        return products;

    }

}
