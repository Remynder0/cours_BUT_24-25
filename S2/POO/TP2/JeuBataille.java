package fr.unicaen.iutgon.info;

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
        p = new PaquetCartes();
        for (int i = 7; i < 15; i++)
            for (int j = 0; j < 4; j++) {
                p.ajouter(new Carte(i, j));
            }

        joueur1 = new Joueur(nom1);
        joueur2 = new Joueur(nom2);
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

        Carte c1, c11, c12;
        Carte c2, c21, c22;
        Joueur j = joueur1;
        int bataille = 0;

        if (joueur1.nbCartesRestantes()==0) {
            return joueur2;
        }
        if (joueur2.nbCartesRestantes()==0) {
            return joueur1;
        }

        c1 = joueur1.prendreCarteDessus();
        c2 = joueur2.prendreCarteDessus();

        if (c1.getHauteur() != c2.getHauteur()) {
            if (c1.getHauteur() < c2.getHauteur())
                j = joueur2;
            j.mettreSousLePaquet(c1);
            j.mettreSousLePaquet(c2);
        } else {
            if (joueur1.nbCartesRestantes()<2) {
                return joueur2;
            }
            if (joueur2.nbCartesRestantes()<2) {
                return joueur1;
            }
            c11 = joueur1.prendreCarteDessus();
            c12 = joueur1.prendreCarteDessus();
            c21 = joueur2.prendreCarteDessus();
            c22 = joueur2.prendreCarteDessus();
            if (c11.getHauteur() != c21.getHauteur()) {
                if (c11.getHauteur() < c21.getHauteur())
                    j = joueur2;
                j.mettreSousLePaquet(c1);
                j.mettreSousLePaquet(c2);
                j.mettreSousLePaquet(c11);
                j.mettreSousLePaquet(c21);
                j.mettreSousLePaquet(c12);
                j.mettreSousLePaquet(c22);
            } else {
                joueur1.mettreSousLePaquet(c1);
                joueur2.mettreSousLePaquet(c2);
                joueur1.mettreSousLePaquet(c11);
                joueur2.mettreSousLePaquet(c21);
                joueur1.mettreSousLePaquet(c12);
                joueur2.mettreSousLePaquet(c22);
            }
        }
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
        System.out.println("Le jeu de cartes ");
        System.out.println(p + "\n");
        p.melanger();
        System.out.println("Le jeu de cartes melange ");
        System.out.println(p + "\n");

        // distribution des cartes
        for (int i = 0; !p.estPaquetVide(); i++) {
            if (i % 2 == 0) joueur1.mettreSousLePaquet(p.tirerCarteDessus());
            else joueur2.mettreSousLePaquet(p.tirerCarteDessus());
        }

        System.out.println(joueur1);
        System.out.println(joueur2);

        System.out.println("On joue :");
        Joueur vainqueur=null;

        for (int nbtour=0;nbtour<100 && vainqueur==null ;nbtour++) {
          vainqueur=jouer1Tour();
          System.out.println("tour="+nbtour+"   vainqueur="+vainqueur)
          ;
          if (vainqueur == null){
              System.out.println(joueur1);
              System.out.println(joueur2);
          }
        }

        System.out.println("\n\n");
        if (vainqueur==null) {
            System.out.println("egalité, on compte les cartes.");
            if (joueur1.nbCartesRestantes() > joueur2.nbCartesRestantes() )
                vainqueur=joueur1;
            else vainqueur=joueur2;
        }
        if (vainqueur==null)
            System.out.println("partie nulle");
        else System.out.println("le vainqueur est " + vainqueur.getNom());
    }
}
