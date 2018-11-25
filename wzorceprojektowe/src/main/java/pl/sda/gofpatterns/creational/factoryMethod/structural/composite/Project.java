package pl.sda.gofpatterns.creational.factoryMethod.structural.composite;

import java.util.ArrayList;

import java.util.List;


public class Project implements Containing {

    private String title;

    private List<Containing> toDos = new ArrayList<>();


    public Project(String title) {

        this.title = title;

    }


    public void addTodo(Containing containing) {

        toDos.add(containing);

    }


    @Override

    public String getContent() {

        StringBuilder builder = new StringBuilder();

        builder.append("<ul>");

        builder.append(title);

        for (Containing toDo : toDos) {

            builder.append("<li>");

            builder.append(toDo.getContent());

            builder.append("</li>");

        }

        builder.append("</ul>");

        return builder.toString();

    }

}
