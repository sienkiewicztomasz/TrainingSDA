package pl.sda.gofpatterns.creational.factoryMethod.behavioral.observer;

import java.util.ArrayList;

import java.util.List;


public class RegisterUserService {

    private List<Person> database = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();


    public void register(Person person) {

        database.add(person);

        notifyObservers(person);


    }


    public void registerObserver(Observer observer) {

        observers.add(observer);

    }

    public void unregisterObserver(Observer observer) {

        observers.remove(observer);

    }


    private void notifyObservers(Person person) {

        for (Observer observer : observers) {

            observer.update(person);

        }

    }


}
