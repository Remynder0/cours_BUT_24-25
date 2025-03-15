package ex3;

public class Divzero {
    public static void main(String[] args) {
        try {
            Div a = new Div(1, 2);
            System.out.println(a.division());

            Div b = new Div(1, 0);
            System.out.println(b.division());
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}

class Div {
    double a, b;

    public Div(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double division() {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro non permise");
        }
        return a / b;
    }
}

