package pl.sda.gofpatterns.creational.factoryMethod.behavioral.interpreter;

import java.util.Stack;


public class CalculatorContext {

    private Stack<Integer> data = new Stack<>();


    public Stack<Integer> getData() {

        return data;

    }

}