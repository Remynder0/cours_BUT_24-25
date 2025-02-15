package exo1;

public class Main {
    public static void main(String[] args) {
        Boisson[] boissons = new Boisson[4];
        boissons[0] = new Boisson("Eau", 1.0);
        boissons[1] = new Boisson("Jus d'orange", 2.5);
        boissons[2] = new BoissonAlcoolisee("Vin rouge", 10.0, 12.5);
        boissons[3] = new BoissonAlcoolisee("Whisky", 25.0, 40.0);

        for (Boisson boisson : boissons) {
            System.out.print(boisson.getNom() + " " + boisson.getPrix());
            if (boisson instanceof BoissonAlcoolisee) {
                BoissonAlcoolisee alcoolisee = (BoissonAlcoolisee) boisson;
                System.out.print(" " + alcoolisee.getDegreAlcool() + "%");
            }
            System.out.println();
        }
    }
}
