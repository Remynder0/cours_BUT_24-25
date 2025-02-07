import java.util.ArrayList;

public class TestClasses {
    public static void main(String[] args) {
        // Création d'une liste d'animaux
        ArrayList<Animal> tableauAnimaux = new ArrayList<>();

        // Création d'un animal
        Animal animal1 = new Animal(50.0f, 100.0f, true, "Lion");
        tableauAnimaux.add(animal1);

        // Création d'un mammifère
        Mammifere mammifere1 = new Mammifere(120.0f, 180.0f, true, "Éléphant", 2, 30.0f);
        tableauAnimaux.add(mammifere1);

        // Ajout d'une copie de l'animal
        Animal copieAnimal = animal1.clone();
        tableauAnimaux.add(copieAnimal);

        // Ajout d'une copie du mammifère
        Mammifere copieMammifere = mammifere1.clone();
        tableauAnimaux.add(copieMammifere);

        // Affichage des éléments du tableau
        System.out.println("----- Liste des Animaux et Mammifères -----");
        for (Animal animal : tableauAnimaux) {
            System.out.println(animal);
        }
    }
}
