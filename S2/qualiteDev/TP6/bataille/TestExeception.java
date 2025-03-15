/*package bataille;
import java.util.Scanner;

public class TestExceptions {

    public static void main(String[] args) {
        try {
            testExceptionDeTasVide();
            testExceptionDeCarteInvalide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testExceptionDeTasVide() {
        PaquetCartes paquet = new PaquetCartes(52);
        for (int i = 1; i <= 52; i++) {
            paquet.ajouterCarte(new Carte(Hauteur.values()[i % 13], Couleur.values()[i % 4]));
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Saisir le nombre des cartes à retirer du jeu (0 pour quitter): ");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            try {
                PaquetCartes cartesRetirees = new PaquetCartes(52);
                for (int i = 0; i < n; i++) {
                    cartesRetirees.ajouterCarte(paquet.tirerCarteDessus());
                }
                System.out.println(n + " cartes retirées: " + cartesRetirees);
            } catch (ExceptionDeTasVide e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void testExceptionDeCarteInvalide() {
        try {
            PaquetCartes paquet32 = new PaquetCartes(32);
            for (int i = 6; i <= 14; i++) {
                for (Couleur couleur : Couleur.values()) {
                    paquet32.ajouterCarte(new Carte(Hauteur.values()[i % 13], couleur));
                }
            }
            paquet32.ajouterCarte(new Carte(Hauteur.DEUX, Couleur.COEUR));
        } catch (ExceptionDeCarteInvalide e) {
            System.out.println(e.getMessage());
        }

        try {
            PaquetCartes paquet52 = new PaquetCartes(52);
            for (int i = 1; i <= 52; i++) {
                paquet52.ajouterCarte(new Carte(Hauteur.values()[i % 13], Couleur.values()[i % 4]));
            }
            paquet52.mettreCarteDessous(new Carte(Hauteur.DEUX, Couleur.TREFLE));
        } catch (ExceptionDeCarteInvalide e) {
            System.out.println(e.getMessage());
        }
    }
}*/

