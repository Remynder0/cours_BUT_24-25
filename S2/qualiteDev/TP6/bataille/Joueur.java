package bataille;

/**
 * Permet de gérer un joueur avec son nom et son paquet de carte.
 */
public class Joueur {
    PaquetCartes mesCartes;
    String nom;

    /**
     * Creation d'un joueur avec un nom et un paquet de cartes vide
     * @param nom : le nom du joueur
     */
    public Joueur(String nom) {
        this.nom = nom;
        mesCartes = new PaquetCartes();
    }

    /**
     *
     * @return nom du joueur
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return le nombre de cartes dans le paquet du joueur
     */
    public int nbCartesRestantes(){
        return mesCartes.getNbCartes();
    }

    /**
     * met une carte en dessous du paquet du joueur
     * @param c : Carte
     */
    public void mettreSousLePaquet(Carte c) {
        mesCartes.mettreCarteDessous(c);
    }

    /** renvoie la carte du dessus du paquet. La carte est supprimée du paquet
     *
     * @return une Carte
     */
    public Carte prendreCarteDessus() throws ExceptionDeTasVide {
        return mesCartes.tirerCarteDessus();
    }

    /**
     * affiche le paquet de cartes du joueur
     */
    @Override
    public String toString() {
        return "Joueur : "  + nom + '\n'+
                mesCartes.toString() ;
    }
}
