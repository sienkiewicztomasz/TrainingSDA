package pl.sda.gofpatterns.creational.factoryMethod.behavioral.iterator;

import java.util.Iterator;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.Iterator;


public class FileReaderIterator implements Iterator<String> {

    private BufferedReader reader;

    private String nextLine;


    public FileReaderIterator(String fileName) throws FileNotFoundException {

        reader = new BufferedReader(

                new FileReader(fileName)

        );

    }


    @Override

    public boolean hasNext() {

        try {

            nextLine = reader.readLine();

        } catch (IOException e) {

            e.printStackTrace();

            nextLine = null;

        }

        return nextLine != null;

    }


    @Override

    public String next() {

        return nextLine;

    }

}