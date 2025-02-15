package exo2;

public class Commercial extends Employe {
    private double sommeFixe;
    private double chiffreAffaires;

    public Commercial(String nom) {
        super(nom);
    }

    public Commercial(String nom, double sommeFixe, double chiffreAffaires) {
        super(nom);
        this.sommeFixe = sommeFixe;
        this.chiffreAffaires = chiffreAffaires;
    }

    public void setInfoSalaire(double sommeFixe, double chiffreAffaires) {
        this.sommeFixe = sommeFixe;
        this.chiffreAffaires = chiffreAffaires;
    }

    @Override
    public double getSalaire() {
        return sommeFixe + (chiffreAffaires * 0.01);
    }
}
