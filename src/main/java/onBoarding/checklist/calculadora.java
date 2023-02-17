package onBoarding.checklist;

public class calculadora {
    double res;
    public calculadora() {

    }

    public double suma(double a, double b) {
        res = a + b;
        return res;
    }

    public double resta(double a, double b) {
        res = a - b;
        return res;
    }

    public double multiplicacion(double a, double b) {
        res = a * b;
        return res;
    }

    public double division(double a, double b) {
        try {
            res = a / b;    
        } catch (ArithmeticException e) {
            System.out.println("La division por 0 no es posible");
        }
        return res;
    }

}
