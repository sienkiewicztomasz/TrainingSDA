package pl.sda.gofpatterns.creational.factoryMethod.behavioral.mediator;

import java.util.HashSet;

import java.util.Set;


public class Chatroom {

    private Set<User> participants = new HashSet<>();

    public void register(User user) {

        participants.add(user);

        user.setChatroom(this);

    }

    public void sendMessage(User from, String message) {

        System.out.println(from.getName() + " wyslal wiadomosc {"

                + message + "} do wszystkich.");

        for (User participant : participants) {

            if (!participant.equals(from)) {

                participant.receive(from, message);

            }

        }

    }

}