package pl.sda.gofpatterns.creational.factoryMethod.structural.facade.todo;

import java.util.ArrayList;

import java.util.List;


class Project implements Containing {

    private String title;

    private List<Containing> toDos = new ArrayList<>();


    Project(String title) {

        this.title = title;

    }


    void addToDo(Containing containing) {

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