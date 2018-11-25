package pl.sda.gofpatterns.creational.factoryMethod.structural.facade;

import pl.sda.gofpatterns.creational.factoryMethod.structural.facade.todo.TodoFacade;


public class ClientMain {

    public static void main(String[] args) {

        TodoFacade facade = new TodoFacade();

        String s = facade.generateHtmlToDo("Zakupki",

                "leki", "piweczko");

        System.out.println(s);


    }

}