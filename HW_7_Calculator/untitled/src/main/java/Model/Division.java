package Model;

public class Division implements Calculate {
    @Override
    public double calculate(double x, double y) {
        if (y == 0){
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return x / y;
    }
}
