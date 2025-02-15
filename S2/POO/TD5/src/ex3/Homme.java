package ex3;

public  class Homme extends Mammifere implements Deplacement,Raisonnement {
    public Homme(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace debout sur mes deux jambes.");
    }

    @Override
    public void reflechir() {
        System.out.println("Je suis en pleine reflexion.");
    }

    @Override
    public String toString() {
        return super.toString() +"Je suis un homme.";
    }
}
