package Controller;

import Model.Calculate;

public class Calculator {

    private Calculate calculate;

    public Calculator(Calculate calculate) {
        this.calculate = calculate;
    }

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }

    public double calculate(double x, double y) {
        double result = calculate.calculate(x, y);
        String operationName = calculate.getClass().getSimpleName();
        Logger.info(operationName, x, y, result);
        return result;
    }
}
