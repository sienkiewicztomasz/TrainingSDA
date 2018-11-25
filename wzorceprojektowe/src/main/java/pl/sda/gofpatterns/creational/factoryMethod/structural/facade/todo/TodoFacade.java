package pl.sda.gofpatterns.creational.factoryMethod.structural.facade.todo;

public class TodoFacade {

    public String generateHtmlToDo(String title, String... toDos){

        Project project = new Project(title);

        for (String toDo : toDos) {

            project.addToDo(new Todo(toDo));

        }

        return project.getContent();

    }

}
