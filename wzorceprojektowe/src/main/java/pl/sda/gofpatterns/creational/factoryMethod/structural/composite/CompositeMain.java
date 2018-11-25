package pl.sda.gofpatterns.creational.factoryMethod.structural.composite;


public class CompositeMain {

    public static void main(String[] args) {

        Project homework = new Project("praca domowa");

        homework.addTodo(new Todo("zadanie 1"));

        homework.addTodo(new Todo("zadanie 2"));


        Project dinner = new Project("Potrawy wigilijne");

        dinner.addTodo(new Todo("karp"));

        dinner.addTodo(new Todo("piwo"));

        dinner.addTodo(new Todo("pizza"));

        dinner.addTodo(homework);

        dinner.addTodo(new Todo("jajka"));

        dinner.addTodo(new Todo("parowki"));


        Project shoppingList = new Project("Zakupy na Swieta");

        shoppingList.addTodo(new Todo("piwo"));

        shoppingList.addTodo(dinner);

        shoppingList.addTodo(new Todo("kup mleko"));

        shoppingList.addTodo(new Todo("mikolaj"));

        System.out.println(shoppingList.getContent());


    }

}
