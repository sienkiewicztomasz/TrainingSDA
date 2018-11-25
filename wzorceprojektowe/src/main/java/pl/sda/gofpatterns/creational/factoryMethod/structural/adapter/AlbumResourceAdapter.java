package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

import java.util.stream.Collectors;



public class AlbumResourceAdapter implements ResourceProduct {

    private final Album album;



    public AlbumResourceAdapter(Album album){

        this.album = album;

    }



    public String getPicture() {

        return album.front();

    }



    public String getContent() {

        return String.join("\n", album.listOfSongs());

    }

}
