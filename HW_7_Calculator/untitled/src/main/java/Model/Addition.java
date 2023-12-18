package Model;

public class Addition implements Calculate {
    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}
