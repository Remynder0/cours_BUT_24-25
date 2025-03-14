public class TestExp1 {
    public static void main(String[] args) {
        // Création d'une constante et d'une variable
        Constante a = new Constante(16);
        Variable x = new Variable(4);

        // Tableau d'expressions
        Exp[] tab = new Exp[2];
        tab[0] = a;
        tab[1] = x;

        // Affichage des valeurs initiales
        System.out.println("a = " + a.evaluer());
        System.out.println("x = " + x.evaluer());
        System.out.println("tab[0] = " + tab[0].evaluer() + " tab[1] = " + tab[1].evaluer());

        // Modification de la valeur de la variable
        x.setValeur(10);
        System.out.println("x = " + x.evaluer());
        System.out.println("tab[0] = " + tab[0].evaluer() + " tab[1] = " + tab[1].evaluer());
    }
}


