package pl.sda.gofpatterns.creational.factoryMethod.behavioral.interpreter;

public class NumberExpression implements Expression {

    private final Integer value;


    public NumberExpression(Integer value) {

        this.value = value;

    }


    @Override

    public void interpret(CalculatorContext context) {

        context.getData().push(value);

    }

}
