package pl.sda.gofpatterns.creational.factoryMethod.behavioral.observer;

import java.util.Objects;


public class Person {

    private final String name;

    private final String surname;


    public Person(String name, String surname) {


        this.name = name;

        this.surname = surname;

    }


    public String getName() {

        return name;

    }


    public String getSurname() {

        return surname;

    }


    @Override

    public String toString() {

        return "Person{" +

                "name='" + name + '\'' +

                ", surname='" + surname + '\'' +

                '}';

    }


    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name) &&

                Objects.equals(surname, person.surname);

    }


    @Override

    public int hashCode() {

        return Objects.hash(name, surname);

    }

}