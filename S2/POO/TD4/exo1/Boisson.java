package exo1;

// Classe exo1.Boisson
public class Boisson {
    private String nom;
    private double prix;

    public Boisson(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "exo1.Boisson: " + nom + ", Prix: " + prix;
    }
}

