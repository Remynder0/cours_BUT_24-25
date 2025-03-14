public class TestExp2 {
    public static void main(String[] args) {
        // Création de constantes et variables
        Constante a = new Constante(16);
        Variable x = new Variable(4);

        // Création d'expressions
        Exp exp1 = new Addition(x, a);
        Exp exp2 = new Multiplication(x, x);

        // Évaluation et affichage des expressions
        System.out.println("e1 : " + exp1.evaluer());
        System.out.println("e2 : " + exp2.evaluer());

        // Modification de la variable
        x.setValeur(100);
        System.out.println("e1 : " + exp1.evaluer());
        System.out.println("e2 : " + exp2.evaluer());
    }
}

