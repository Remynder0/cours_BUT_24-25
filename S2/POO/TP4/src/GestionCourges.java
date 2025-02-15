import java.util.ArrayList;

public class GestionCourges {
    private ArrayList<Courge> courges;

    public GestionCourges() {
        courges = new ArrayList<>();
    }

    public void enregistrerCourge(Courge courge) {
        courges.add(courge);
    }

    public Courge chercherCourgeParEmplacement(int emplacement) {
        for (Courge courge : courges) {
            if (courge.getEmplacement() == emplacement) {
                return courge;
            }
        }
        return null;
    }

    public void changerPoidsCourge(int emplacement, float nouveauPoids) {
        Courge courge = chercherCourgeParEmplacement(emplacement);
        if (courge!= null) {
            courge.setPoids(nouveauPoids);
        }
    }

    public ArrayList<Courge> getCourgesDisponibles() {
        ArrayList<Courge> courgesDisponibles = new ArrayList<>();
        for (Courge courge : courges) {
            if (courge.isDisponible()) {
                courgesDisponibles.add(courge);
            }
        }
        return courgesDisponibles;
    }

    public float prixtotalCourgesDisponibles() {
        float prixTotal = 0;
        for (Courge courge : getCourgesDisponibles()) {
            prixTotal += courge.getPoids();
        }
        return prixTotal;
    }

    public void afficherInformation(){
        for(Courge courge : courges){
            System.out.println(courge);
        }
    }
}
