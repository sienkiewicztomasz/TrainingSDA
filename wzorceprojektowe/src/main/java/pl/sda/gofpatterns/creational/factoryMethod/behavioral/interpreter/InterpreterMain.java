package pl.sda.gofpatterns.creational.factoryMethod.behavioral.interpreter;

public class InterpreterMain {

    public static void main(String[] args) {

        CalculatorParser parser = new CalculatorParser();

        String parse = parser.parse("3 3 + 4 -");

        String[] context = {"3", "3", "+", "4", "-"};

        System.out.println(parse);

    }

}
