package pl.sda.gofpatterns.creational.factoryMethod.structural.bridge;

public class LongView implements View {

    private final Resource resource;



    public LongView(Resource resource) {

        this.resource = resource;

    }



    @Override

    public void show() {

        System.out.println("Long View");

        System.out.println(resource.getHeader());

        System.out.println(resource.getImage());

        System.out.println(resource.getContent());

        System.out.println(resource.getFooter());

    }

}

