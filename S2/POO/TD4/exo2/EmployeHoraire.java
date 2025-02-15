package exo2;

public class EmployeHoraire extends Employe {
    private double tauxHoraire;
    private int heuresTravaillees;

    public EmployeHoraire(String nom) {
        super(nom);
    }

    public EmployeHoraire(String nom, double tauxHoraire, int heuresTravaillees) {
        super(nom);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    public void setInfoSalaire(double tauxHoraire, int heuresTravaillees) {
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double getSalaire() {
        if (heuresTravaillees > 39) {
            return (39 * tauxHoraire) + ((heuresTravaillees - 39) * tauxHoraire * 1.3);
        } else {
            return heuresTravaillees * tauxHoraire;
        }
    }
}

