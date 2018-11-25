package pl.sda.gofpatterns.creational.factoryMethod.structural.bridge;

public class BridgeMain {

    public static void main(String[] args) {

        Resource resource = new AlbumResource(

                "Mirage",

                "album_mirage.jpg",

                "Pierwsza piosenka",

                "Armada"

        );

        View view = new LongView(resource);

        view.show();

    }

}