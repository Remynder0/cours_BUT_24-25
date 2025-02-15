package ex1;

public class Voiture extends Vehicule {
    public int puissance;
    
    public Voiture(String nom, int puissance) {
        super(nom);
        this.puissance = puissance;
    }
    
    @Override
    public String getCategorie() {
        return "ex1.Voiture";
    }
    
    @Override
    public double getVitesseMaximum() {
        return 1.5*puissance;
    }
}
