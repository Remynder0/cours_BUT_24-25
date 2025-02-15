import ex1.BateauARames;
import ex1.Vehicule;
import ex1.Voiture;

public class TestVehicule {
    public static void main(String[] args) {

        // Test de la classe Voiture
        Vehicule[] vehicle = new Vehicule[4];
        vehicle[0] = new Voiture("titine",6);
        vehicle[1] = new Voiture("Espace", 5);
        vehicle[2] = new BateauARames("Le Bateau", 20);
        vehicle[3] = new BateauARames("pio",4);

        // Affichage des informations sur les véhicules
        for (Vehicule v : vehicle) {
            System.out.println(v.toString());
            System.out.println(v.estVitessePossible(15));
        }
    }
}

