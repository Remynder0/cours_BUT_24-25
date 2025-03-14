import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TesteCollections{
    public static <ListIterator> void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();
        Random rand = new Random();



        long deb = System.currentTimeMillis();
       for (int i = 0; i < 100000; i++) {
           array.add(0,rand.nextDouble());
       }

       long fin = System.currentTimeMillis();
       System.out.println("ajout debut : "+(fin-deb));
       array.clear();

       deb = System.currentTimeMillis();
       for (int i = 0; i < 100000; i++) {
           array.add(rand.nextDouble());
       }
       fin = System.currentTimeMillis();
       System.out.println("ajout fin : "+(fin-deb));

        deb = System.currentTimeMillis();
       for (int i = 0; i < 10000; i++) {
           double x = array.get(rand.nextInt(array.size()));
       }
        fin = System.currentTimeMillis();
        System.out.println("parcours aleatoire : "+(fin-deb));

        deb = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            array.remove(array.contains(rand.nextDouble()));
        }
        fin = System.currentTimeMillis();
        System.out.println("parcours aleatoire (contains) : "+(fin-deb));

        System.out.println("\n(temps en nano secondes)");
        deb = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            double x =array.get(i);
        }
        fin = System.nanoTime();
        System.out.println("parcours sequentiel : "+(fin-deb));

        deb = System.nanoTime();
        Iterator iterator = array.iterator();
        for (int i = 0; i < 10000; i++) {
            double x = (double) iterator.next();
        }
        fin = System.nanoTime();
        System.out.println("parcours avec iterator : "+(fin-deb));

        deb = System.nanoTime();
        ListIterator listIterator = (ListIterator) array.listIterator();
        for (int i = 0; i < 10000; i++) {
            double x = (double) ((java.util.ListIterator<?>) listIterator).next();
        }
        fin = System.nanoTime();
        System.out.println("parcours avec listIterator : "+(fin-deb));

        deb = System.nanoTime();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            double x = array.get(i);
            System.out.println(x);
        }
        fin = System.nanoTime();
        System.out.println("parcours sequentiel 10 : "+(fin-deb));

        deb = System.nanoTime();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            double x = (double) iterator.next();
            System.out.println(x);
        }
        fin = System.nanoTime();
        System.out.println("parcours avec iterator 10 : "+(fin-deb));

        deb = System.nanoTime();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            double x = (double) ((java.util.ListIterator<?>) listIterator).next();
            System.out.println(x);
        }
        fin = System.nanoTime();
        System.out.println("parcours avec listIterator 10 : "+(fin-deb));

        /*
         *
         * Méthode séquentielle : Lorsque vous utilisez la méthode séquentielle (array.get(i)),
         * vous récupérez directement les valeurs de la liste en utilisant leur indice.
         * Les valeurs sont affichées exactement comme elles sont stockées dans la liste.
         *
         * Méthode avec Iterator : Lorsque vous utilisez la méthode avec Iterator (iterator.next()),
         * vous récupérez les valeurs de la liste en utilisant l'itérateur.
         * L'itérateur peut retourner les valeurs sous une forme légèrement différente,
         * par exemple en les convertissant en objet ou en les formatant différemment.
         *
         * Méthode avec ListIterator : Lorsque vous utilisez la méthode avec ListIterator (listIterator.next()),
         * vous récupérez les valeurs de la liste en utilisant l'itérateur de liste.
         * L'itérateur de liste peut retourner les valeurs sous une forme légèrement différente,
         * par exemple en les convertissant en objet ou en les formatant différemment.
         *
         */
        Liste liste = new LinkedListe();

        // Ajouter des éléments à la liste
        deb = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            liste.add(0,rand.nextDouble());
        }

        fin = System.currentTimeMillis();
        System.out.println("ajout debut : "+(fin-deb));
        array.clear();

        // Méthode séquentielle
        deb = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            double x = liste.get(i);
        }
        fin = System.nanoTime();
        System.out.println("Temps écoulé pour la méthode séquentielle : " + (fin - deb) + " nanosecondes");

// Méthode avec Iterator
        deb = System.nanoTime();
        iterator = liste.iterator();
        for (int i = 0; i < 10; i++) {
            double x = (double) iterator.next();
        }
        fin = System.nanoTime();
        System.out.println("Temps écoulé pour la méthode avec Iterator : " + (fin - deb) + " nanosecondes");

// Méthode avec ListIterator
        deb = System.nanoTime();
        listIterator = (ListIterator) liste.listIterator();
        for (int i = 0; i < 10; i++) {
            double x = (double) ((Iterator<?>) listIterator).next();
        }
        fin = System.nanoTime();
        System.out.println("Temps écoulé pour la méthode avec ListIterator : " + (fin - deb) + " nanosecondes");

    }
}

