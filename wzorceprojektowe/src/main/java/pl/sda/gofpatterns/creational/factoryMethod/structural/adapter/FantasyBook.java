package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

public class FantasyBook implements Book {

    private String biography, title,

    frontPicture;



    public FantasyBook(String biography,

                       String title,

                       String frontPicture) {

        this.biography = biography;

        this.title = title;

        this.frontPicture = frontPicture;

    }



    public String biography() {

        return biography;

    }



    public String title() {

        return title;

    }



    public String frontPicture() {

        return frontPicture;

    }

}
