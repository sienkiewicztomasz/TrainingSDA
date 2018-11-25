package pl.sda.gofpatterns.creational.factoryMethod.behavioral.interpreter;

public class MinusNumberExpresssion implements Expression {

    @Override

    public void interpret(CalculatorContext context) {

        Integer value1 = context.getData().pop();

        Integer value2 = context.getData().pop();

        context.getData().push(value2 - value1);

    }

}
