package bataille;

/**
 * Lance le jeu de bataille
 */
public class Main {

    /**
     * crée un jeu de bataille et lance le jeu
     * @param args  non utilisé
     */
    public static void main(String[] args) throws ExceptionDeTasVide {


        JeuBataille jb=new JeuBataille("Bulbizarre", "Dracaufeu");

        jb.jouer();



    }
}
