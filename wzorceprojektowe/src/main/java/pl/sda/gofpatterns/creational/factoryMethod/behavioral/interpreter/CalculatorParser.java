package pl.sda.gofpatterns.creational.factoryMethod.behavioral.interpreter;

import java.util.StringJoiner;


public class CalculatorParser {

    // 3 3 + 4 +

    String parse(String value) {

        CalculatorContext context = new CalculatorContext();

        String[] s = value.split(" ");

        for (String s1 : s) {

            Expression expression = getExpression(s1);

            expression.interpret(context);

        }

        StringJoiner stringJoiner = new StringJoiner(", ");

        for (Integer datum : context.getData()) {

            stringJoiner.add(datum.toString());

        }

        return stringJoiner.toString();

    }


    Expression getExpression(String value) {

        Expression expression;

        if (value.equals("+")) {

            expression = new PlusNumberExpression();

        } else if (value.equals("-")) {

            expression = new MinusNumberExpresssion();

        } else {

            Integer integer = Integer.valueOf(value);

            expression = new NumberExpression(integer);

        }

        return expression;

    }

}