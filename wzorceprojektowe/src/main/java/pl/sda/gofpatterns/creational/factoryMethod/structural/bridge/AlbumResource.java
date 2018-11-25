package pl.sda.gofpatterns.creational.factoryMethod.structural.bridge;

public class AlbumResource implements Resource{

    private String header, image, content, footer;



    public AlbumResource(String header,

                         String image,

                         String content,

                         String footer) {

        this.header = header;

        this.image = image;

        this.content = content;

        this.footer = footer;

    }



    @Override

    public String getHeader() {

        return header;

    }



    @Override

    public String getImage() {

        return image;

    }



    @Override

    public String getContent() {

        return content;

    }



    @Override

    public String getFooter() {

        return footer;

    }

}