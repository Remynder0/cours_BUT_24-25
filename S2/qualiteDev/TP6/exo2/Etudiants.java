package exo2;

public class Etudiants {
    private String nom;
    private int heures;
    private double credits;

    public Etudiants(String chaine){
        String[] etudiant = chaine.split(" ");
        this.nom = etudiant[0];
        this.heures = Integer.parseInt(etudiant[1]);
        this.credits = Double.parseDouble(etudiant[2]);
    }

    public String getNom() {
        return nom;
    }

    public int getHeures() {
        return heures;
    }

    public double getCredits() {
        return credits;
    }
}
