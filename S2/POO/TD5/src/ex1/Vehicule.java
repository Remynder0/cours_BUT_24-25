package ex1;

public abstract class Vehicule {
    private String nom;

    public Vehicule(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean estVitessePossible(float v){
        return v <= getVitesseMaximum();
    }

    public abstract String getCategorie();

    public abstract double getVitesseMaximum();
}


