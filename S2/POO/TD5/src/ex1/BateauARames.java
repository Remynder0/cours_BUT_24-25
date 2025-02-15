package ex1;

public class BateauARames extends Vehicule {
    public int nbrameur;
    
    public BateauARames(String nom, int nb) {
        super(nom);
        this.nbrameur = nb;
    }

    @Override
    public String getCategorie() {
        return "Bateau à rames";
    }

    @Override
    public double getVitesseMaximum() {
        return 0.5*nbrameur;
    }
}
