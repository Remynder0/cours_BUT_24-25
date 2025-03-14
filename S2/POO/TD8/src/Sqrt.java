public class Sqrt implements Exp{
    private Exp exp;
    
    public Sqrt(Exp exp) {
        this.exp = exp;
    }
    public double evaluer() {
        return Math.sqrt(exp.evaluer());
    }
}
