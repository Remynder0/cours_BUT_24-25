public class Soustraction implements Exp {
    private Exp exp1;
    private Exp exp2;

    public Soustraction(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public double evaluer() {
        return exp1.evaluer() - exp2.evaluer();
    }
}