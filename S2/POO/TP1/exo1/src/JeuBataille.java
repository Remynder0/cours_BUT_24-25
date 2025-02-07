package bataille.exo1.src;

import fr.unicaen.iutgon.info.carte.*;

public class JeuBataille {

    /**
     * La classe JeuBataille dispose d'un constructeur et d'une méthode jouer()
     */
    private PaquetCartes p;
    private Joueur joueur1, joueur2;

    /**
     * le constructeur crée  un jeu de  32 cartes et 2 joueurs.
     * @param nom1  nom du joueur 1
     * @param nom2  nom du joueur 2
     */
    public JeuBataille(String nom1, String nom2) {
        this.joueur1 = new Joueur(nom1);
        this.joueur2 = new Joueur(nom2);

        this.p = new PaquetCartes();

        for (int i = 0; i < 4 ; i++) {
            for (int j = 7; j <= 14; j++) {
                Carte c = new Carte(j,i);
                p.ajouter(c);
            }
        }
    }

    @Override
    public String toString() {
        return  p.toString();
    }

    /**
     *
     *  Un tour de jeu :
     *      Chaque joueur tire la carte du dessus de son jeu.
     *      Le joueur qui a la carte de plus grand hauteur gagne le tour et met les deux cartes en dessous
     *      de son paquet.
     *      Si les deux cartes sont identiques, on fait une bataille :
     *          Chaque joueur tire 2 cartes du dessus de son paquet.
     *          on compare la premiere carte de chaque joueur de ce second tirage.
     *          Le joueur qui a la carte la plus haute ramasse toutes les cartes et les met en dessous de son paquet
     *          En cas d'égalité, chacun joueur ramasse ses cartes et les met en dessous de son paquet.
     *
     * @return null dans le cas d'un tour normal, la reference joueur vainqueur si un des joueurs ne peut pas jouer.
     *
     */

    public Joueur jouer1Tour(){

        if (joueur1.nbCartesRestantes()==0) return  joueur2;
        if (joueur2.nbCartesRestantes()==0) return  joueur1;

        Carte c1 = joueur1.prendreCarteDessus();
        Carte c2 = joueur2.prendreCarteDessus();
        System.out.println("Carte tirée : " + c1);
        System.out.println("Carte tirée : " + c2);

        if (c1.getHauteur() > c2.getHauteur()){
            joueur1.mettreSousLePaquet(c1);
            joueur1.mettreSousLePaquet(c2);
        }
        else if (c1.getHauteur() < c2.getHauteur()){
            joueur2.mettreSousLePaquet(c1);
            joueur2.mettreSousLePaquet(c2);
        }
        else {
            jouer1Tour();
        }
        System.out.println(joueur1.nbCartesRestantes());
        System.out.println(joueur2.nbCartesRestantes());

        return null;
    }

    /**
     * permet de jouer une partie de bataille.
     * La méthode effectue le traitement suivant :
     *  - mélange des cartes
     *  - distribution des cartes entre les deux joueurs
     *  - lance au maximum 100 tours de jeu.
     *
     *  le jeu s'arrete lorsque
     *      - un joueur n'a plus de carte, l'autre joueur est déclaré vainqueur.
     *      - 100 tours ont été joues. Le joueur qui a le plus de cartes est déclare vainqueur, sinon egalite
     *
     *
     */


    public void jouer() {

        // mélanger le jeu
        p.melanger();

        // distribution des cartes
        boolean donneur = true;
        while (!p.estPaquetVide()) {
            Carte carte = p.tirerCarteDessus();
            if (donneur) {
                joueur1.mettreSousLePaquet(carte);
            } else {
                joueur2.mettreSousLePaquet(carte);
            }
            donneur = !donneur; // Alterner entre les joueurs
        }
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(p);

        int tours = 0;
        while(jouer1Tour()==null && tours < 100){
            tours++;
            System.out.println();

        }
        if (joueur1.nbCartesRestantes() > joueur2.nbCartesRestantes()) {
            System.out.println(joueur1.getNom() + " a gagné !!");
        }
        else if (joueur1.nbCartesRestantes() < joueur2.nbCartesRestantes()) {
            System.out.println(joueur2.getNom() + " a gagné !!");
        }
        else {
            System.out.println("Match nul !!");
        }

    }
}
