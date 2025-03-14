public class RcnePoly2 {
    // Méthode pour calculer √(Delta)
    static public Exp SqrtDelta(Exp a, Exp b, Exp c) {
        Exp delta = new Soustraction(
                new Multiplication(b, b),
                new Multiplication(new Constante(4), new Multiplication(a, c))
        );

        return new Sqrt(delta); // Fonction racine carrée
    }

    public static void main(String[] args) {
        // Définition des coefficients de l'équation
        Variable a = new Variable(1);
        Variable b = new Variable(2);
        Variable c = new Variable(1);

        System.out.println("Résolution de " + a.evaluer() + " x^2 + " +
                b.evaluer() + " x + " + c.evaluer());

        // Calcul de -b
        Exp moinsB = new Soustraction(new Constante(0), b);

        // Calcul de √(Delta)
        Exp sqrtDelta = SqrtDelta(a, b, c);

        // Première racine
        Exp r1 = new Division(
                new Addition(moinsB, sqrtDelta),
                new Multiplication(new Constante(2), a)
        );

        // Deuxième racine
        Exp r2 = new Division(
                new Soustraction(moinsB, sqrtDelta),
                new Multiplication(new Constante(2), a)
        );

        // Affichage des racines
        System.out.println("r1: " + r1.evaluer());
        System.out.println("r2: " + r2.evaluer());

        // Modification de la valeur des variables pour un deuxième calcul
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        b.setValeur(1);

        System.out.println("Résolution de " + a.evaluer() + " x^2 + " +
                b.evaluer() + " x + " + c.evaluer());

        System.out.println("r1: " + r1.evaluer());
        System.out.println("r2: " + r2.evaluer());
    }
}
