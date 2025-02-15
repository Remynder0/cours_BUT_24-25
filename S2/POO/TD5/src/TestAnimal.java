import ex3.*;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[3];
        animaux[0] = new Mammifere("Mammifère 1");
        animaux[1] = new Chien("Chien 1");
        animaux[2] = new Homme("Homme 1");


        for (Animal animal : animaux) {
            System.out.println(animal.toString());

            if (animal instanceof Deplacement) {
                ((Deplacement) animal).seDeplacer();
            }

            if (animal instanceof Raisonnement) {
                ((Raisonnement) animal).reflechir();
            }

            System.out.println();
        }



        Deplacement[] dep = new Deplacement[animaux.length];
        int depIndex = 0;
        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] instanceof Deplacement) {
                dep[depIndex] = (Deplacement) animaux[i];
                depIndex++;
            }
        }

        System.out.println("Animaux ayant des capacités de déplacement:");
        for (Deplacement d : dep) {
            if (d != null) {
                System.out.println(d.toString());
            }
        }

        Raisonnement[] rai = new Raisonnement[animaux.length];
        int raiIndex = 0;
        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] instanceof Raisonnement) {
                rai[raiIndex] = (Raisonnement) animaux[i];
                raiIndex++;
            }
        }

        System.out.println("Animaux ayant des capacités de raisonnement:");
        for (Raisonnement r : rai) {
            if (r != null) {
                System.out.println(r.toString());
            }
        }
    }
}
