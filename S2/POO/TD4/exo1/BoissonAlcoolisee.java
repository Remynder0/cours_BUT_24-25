package exo1;

// Classe exo1.BoissonAlcoolisee
public class BoissonAlcoolisee extends Boisson {
    private double degreAlcool;

    public BoissonAlcoolisee(String nom, double prix, double degreAlcool) {
        super(nom, prix);
        this.degreAlcool = degreAlcool;
    }

    public double getDegreAlcool() {
        return degreAlcool;
    }

    @Override
    public String toString() {
        return "exo1.Boisson Alcoolisée: " + getNom() + ", Prix: " + getPrix() + ", Degré d'alcool: " + degreAlcool;
    }
}
