public class Variable implements Exp{
    double x;

    public Variable(double s) {
        this.x = s;
    }
    
    public double evaluer() {
        return x;
    }

    public void setValeur(double s) {
        x = s;
    }
}
