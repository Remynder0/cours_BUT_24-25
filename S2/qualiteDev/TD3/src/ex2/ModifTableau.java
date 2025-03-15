package ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModifTableau {
    public static void aff(double t[]) {
        for (double d : t) System.out.print(d + " : ");
        System.out.println();
    }

    public static void main(String arg[]) {
        double d[] = {3, 4, 5, 1, 7};

        aff(d);

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Veuillez saisir l'indice de l'élément à traiter:");
                int indice = sc.nextInt();

                System.out.println("Veuillez saisir le diviseur :");
                int diviseur = sc.nextInt();

                d[indice] /= diviseur;
                aff(d);
                break;  // sortir de la boucle une fois que l'opération est réussie
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erreur : l'indice est hors limites.");
            } catch (InputMismatchException e) {
                System.out.println("Erreur : la valeur saisie n'est pas un nombre.");
                sc.next();  // vider l'entrée incorrecte
            } catch (ArithmeticException e) {
                System.out.println("Erreur : division par zéro.");
            }
        }
    }
}

