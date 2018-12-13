package pl.sda.excelComposition;

import java.math.BigDecimal;


public class BalanceCalculator {

    BigDecimal calculate(BalanceData data) {


        BigDecimal sumIncomes = BigDecimal.ZERO;
        BigDecimal sumOutcomes = BigDecimal.ZERO;


        for (BigDecimal nextIncome : data.getIncomes()) {
            sumIncomes = sumIncomes.add(nextIncome);
        }

        for (BigDecimal nextOutcome : data.getOutcomes()) {
            sumOutcomes = sumOutcomes.add(nextOutcome);
        }


        BigDecimal result = sumIncomes.subtract(sumOutcomes);

        return result;

    }
}
