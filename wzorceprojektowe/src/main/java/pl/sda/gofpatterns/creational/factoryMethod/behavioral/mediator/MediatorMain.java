package pl.sda.gofpatterns.creational.factoryMethod.behavioral.mediator;

public class MediatorMain {

    public static void main(String[] args) {

        User user1 = new User("Przemek");

        User user2 = new User("Tomek");

        User user3 = new User("Romek");

        Chatroom chatroom = new Chatroom();

        chatroom.register(user1);

        chatroom.register(user2);

        chatroom.register(user3);


        user1.sendToAll("Czesc");

        user2.sendToAll("No siemka");

        User user4 = new User("Gienio");

        chatroom.register(user4);

        user2.sendToAll("Witamy nowego ");


    }


}
