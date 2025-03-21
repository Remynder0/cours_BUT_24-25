package exp_arithmetiques;

public class Constante implements Exp {
    private final double x;

    public Constante(double x) {
        this.x = x;
    }
    public double evaluer() {
        return x;
    }
}
