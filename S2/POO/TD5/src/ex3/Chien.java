package ex3;

public class Chien extends Mammifere implements Deplacement {
    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je marche à quatre pattes.");
    }

    @Override
    public String toString() {
        return super.toString()+"Je suis un chien.";
    }
}


