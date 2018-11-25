package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

import java.util.Arrays;

import java.util.List;



public class HipHopAlbum implements Album{

    public List<String> listOfSongs() {

        return Arrays.asList(

                "pierwsza piosenka",

                "druga piosenka"

        );

    }



    public String front() {

        return "zdjecie Peji";

    }

}
