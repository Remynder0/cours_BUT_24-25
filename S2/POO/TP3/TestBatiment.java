import exo2.Batiment;
import exo2.Usine;
import exo2.Villa;

public class TestBatiment {
    public static void main(String[] args) {
        // Tester la classe Batiment
        System.out.println("=== Test de la classe Batiment ===");
        Batiment batiment = new Batiment("Batiment Général", "1 Rue Principale", 200);
        batiment.afficher();
        System.out.println("\nImpôt du bâtiment : " + batiment.getImpot());
        System.out.println("Catégorie du bâtiment : " + batiment.getCategorie());
        System.out.println();

        // Tester la classe Villa avec le constructeur principal
        System.out.println("=== Test de la classe Villa avec le constructeur principal ===");
        Villa villa1 = new Villa("Villa Luxe", "10 Rue des Vacances", 300, 6, true);
        villa1.afficher();
        System.out.println("\nImpôt de la villa : " + villa1.getImpot());
        System.out.println("Catégorie de la villa : " + villa1.getCategorie());
        System.out.println();

        // Tester la classe Villa avec le constructeur secondaire (valeurs par défaut)
        System.out.println("=== Test de la classe Villa avec le constructeur secondaire ===");
        Villa villa2 = new Villa("Villa Simple", "15 Rue de la Paix", 150);
        villa2.afficher();
        System.out.println("\nImpôt de la villa : " + villa2.getImpot());
        System.out.println("Catégorie de la villa : " + villa2.getCategorie());
        System.out.println();

        // Tester la classe Usine
        System.out.println("=== Test de la classe Usine ===");
        Usine usine = new Usine("Usine Industrielle", "Zone Industrielle", 500, "IndusCorp", 15, 7);
        usine.afficher();
        System.out.println("\nCatégorie de l'usine : " + usine.getCategorie());
        System.out.println("Flux de vehicule de l'usine : " + usine.FLuxVehicule());

    }
}

class TabBatiment {
    protected Batiment[] batiments;

    TabBatiment(int nbBatiments) {
        batiments = new Batiment[nbBatiments];
    }

    
}