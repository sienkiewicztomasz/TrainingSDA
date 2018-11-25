package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

public class ViewProduct {

    private final ResourceProduct product;



    public ViewProduct(ResourceProduct product) {

        this.product = product;

    }



    void show(){

        System.out.println(product.getPicture());

        System.out.println("~~~~~~~~~~");

        System.out.println(product.getContent());

    }

}
