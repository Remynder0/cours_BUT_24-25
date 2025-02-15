package exo2;

public abstract class Employe {
    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract double getSalaire();

    @Override
    public String toString() {
        return nom;
    }
}

