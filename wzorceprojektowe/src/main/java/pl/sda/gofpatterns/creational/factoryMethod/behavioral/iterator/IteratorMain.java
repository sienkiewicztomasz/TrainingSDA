package pl.sda.gofpatterns.creational.factoryMethod.behavioral.iterator;

import java.io.FileNotFoundException;

import java.util.Arrays;

import java.util.Iterator;

import java.util.List;


public class IteratorMain {

    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> integers = Arrays.asList(1, 1, 1, 2, 3, 4, 5);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {

            Integer next = iterator.next();

            System.out.println(next);

        }


        String fileName = "C:\\Users\\przemyslawz\\Documents\\Training\\wzorceprojektowe2\\src\\main\\java\\pl\\sda\\gofpatterns\\behavioral\\interpreter\\Expression.java";

        FileReaderIterator fileReaderIterator =

                new FileReaderIterator(fileName);

        while (fileReaderIterator.hasNext()) {

            System.out.println(fileReaderIterator.next());

        }

    }

}