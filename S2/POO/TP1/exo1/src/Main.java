package bataille.exo1.src;

import bataille.exo1.src.JeuBataille;

/**
 * Lance le jeu de bataille
 */
public class Main {

    /**
     * crée un jeu de bataille et lance le jeu
     * @param args  non utilisé
     */
    public static void main(String[] args) {

        JeuBataille jeu = new JeuBataille("Alice", "Bob");
        jeu.jouer();



    }
}
