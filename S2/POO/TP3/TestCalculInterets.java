import exo1.Compte;
import exo1.CompteEpargne;

import java.util.Scanner;

public class TestCalculInterets {

    public static Compte creerCompte() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("compte simple ou compte avec interet : ");
        String typeCompte = scanner.nextLine();

        System.out.print("Identifiant de compte : ");
        String identifiant = scanner.nextLine();

        float solde = 0.0f;
        boolean soldeValide = false;

        while (!soldeValide) {
            try {
                System.out.print("Bodycompte ? ");
                solde = scanner.nextFloat();
                soldeValide = true;
            } catch (NumberFormatException e) {
                System.out.println("Erreur : veuillez entrer une valeur numérique valide pour le solde.");
            }
        }

        if (typeCompte.equals("compte avec interet")) {
            float taux = 0.0f;
            boolean tauxValide = false;

            while (!tauxValide) {
                try {
                    System.out.print("taux d'interet : ");
                    taux = scanner.nextFloat();
                    tauxValide = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erreur : veuillez entrer une valeur numérique valide pour le taux d'interet.");
                }
            }
            return new CompteEpargne(identifiant, solde, taux);

        }
        return new Compte(identifiant, solde);
    }


    public static void main(String[] args) {
        Compte compte1 = new Compte("A01", 1000f);
        CompteEpargne compte2 = new CompteEpargne("E99", 1000f, 0.1f);
        compte2.setAnnees(5);

        Compte c;
        String message = "L'argent qui dort ne rapporte rien :";

        c = compte1;
        message += "\nSolde compte " + c.getIdentifiant() + " : " + c.getSolde() + " " + c.getNatureCompte();

        c = compte2;
        message += "\nSolde compte " + c.getIdentifiant() + " : " + c.getSolde() + " " + c.getNatureCompte();

        System.out.println(message);

        Compte compte3 = TestCalculInterets.creerCompte();

        Compte[] comptes = new Compte[3];

        comptes[0] = compte1;
        comptes[1] = compte2;
        ((CompteEpargne) comptes[1]).setAnnees(5);
        comptes[2] = compte3;
        ((CompteEpargne) comptes[2]).setAnnees(3);

        for (Compte compte : comptes) {
            System.out.println("\nSolde compte " + compte.getIdentifiant() + " : " + compte.getSolde() + " " + compte.getNatureCompte());
        }

    }
}
