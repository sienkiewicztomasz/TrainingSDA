package pl.sda.gofpatterns.creational.factoryMethod.behavioral.mediator;

import java.util.Objects;


public class User {

    private final String name;

    private Chatroom chatroom;

    public User(String name) {

        this.name = name;

    }


    public void setChatroom(Chatroom chatroom) {

        this.chatroom = chatroom;

    }


    public String getName() {

        return name;

    }


    public void sendToAll(String message) {

        chatroom.sendMessage(this, message);

    }


    public void receive(User from, String message) {

        System.out.println(name +

                " dostal wiadomosc od: " +

                from.name +

                " {" + message + "}");

    }


    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(name, user.name);

    }


    @Override

    public int hashCode() {

        return Objects.hash(name);

    }

}
