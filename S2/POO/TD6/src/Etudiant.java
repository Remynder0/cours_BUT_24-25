import java.util.Objects;

public class Etudiant implements Comparable<Etudiant> {
    private static int etuPass = 21800001;

    String formation;
    String nom;
    String prenom;
    private double noteMoyenneUE1;
    private double noteMoyenneUE2;
    private int ID;

    public Etudiant(String formation, String nom, String prenom) {
        this.formation = formation;
        this.nom = nom;
        this.prenom = prenom;
        this.noteMoyenneUE1 = 0.0;
        this.noteMoyenneUE2 = 0.0;
        this.ID = etuPass;
        etuPass++;
    }

    public void setNoteMoyenneUE(int unite, int[] notesUE) {
        double somme = 0.0;

        if (notesUE.length > 0) {
            somme = notesUE[0];
            for (int n = 1; n < notesUE.length; n++) {
                somme += notesUE[n];
            }
            somme /= notesUE.length;
        }

        if (unite == 1) {
            this.noteMoyenneUE1 = somme;
        } else if (unite == 2) {
            this.noteMoyenneUE2 = somme;
        }
    }

    @Override
    public String toString() {
        return this.ID + ":" + this.nom + "," + this.prenom + ",Etudiant " + this.formation +
                ",UE1:" + this.noteMoyenneUE1 + ",UE2:" + this.noteMoyenneUE2;
    }

    @Override
    public int compareTo(Etudiant o) {
        return o.ID - this.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formation, nom, prenom);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Etudiant etudiant = (Etudiant) obj;
        return Double.compare(etudiant.noteMoyenneUE1, noteMoyenneUE1) == 0 &&
                Double.compare(etudiant.noteMoyenneUE2, noteMoyenneUE2) == 0 &&
                formation.equals(etudiant.formation) &&
                nom.equals(etudiant.nom) &&
                prenom.equals(etudiant.prenom);
    }

}

