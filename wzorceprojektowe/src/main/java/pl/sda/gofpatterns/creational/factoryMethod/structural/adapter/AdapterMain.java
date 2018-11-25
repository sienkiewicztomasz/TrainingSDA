package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        Album album1 = new HipHopAlbum();

        Book book1 = new FantasyBook("Zyl dlugo i szczesliwie",

                "Rok 2023", "zdjecie ksiazki 1");

        Book book2 = new FantasyBook("Zyl plasko i szczesliwie",

                "Encyklopedia plaskoziemcy", "zdjecie talerza");

        ViewProduct viewProduct = new ViewProduct(new AlbumResourceAdapter(album1));

        viewProduct.show();







    }

}
