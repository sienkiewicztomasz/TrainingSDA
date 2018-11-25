package pl.sda.gofpatterns.creational.factoryMethod.structural.adapter;

public class BookResourceAdapter implements ResourceProduct {

    private final Book book;



    public BookResourceAdapter(Book book){

        this.book = book;

    }

    @Override

    public String getPicture() {

        return book.frontPicture();

    }



    @Override

    public String getContent() {

        return book.title() + "\n----------\n" + book.biography();

    }

}
