package ex3;

public class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Je suis un animal de nom " + nom+"."+"Je suis un mammifère.";
    }
}

