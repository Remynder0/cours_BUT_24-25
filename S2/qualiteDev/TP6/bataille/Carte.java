package bataille;

/**
 * Permet de créer des cartes et d'avoir des informations sur les cartes.
 * Une carte dispose de deux attributs : une hauteur et une couleur
 */
public class Carte {
    private final Hauteurs hauteur;
    private final Couleurs couleur;

    /**
     *
     * @return une String contenant la hauteur et la couleur de la carte. Exemple : valet de pique
     */
    @Override
    public String toString() {
      return this.hauteur+ " de "+ this.couleur;
    }

    /**
     * constructeur :
     * @param c   couleur de la carte
     * @param h   hauteur de la carte
     */
    public Carte(Couleurs c, Hauteurs h) {
        hauteur=h;
        couleur=c;
    }

    /**
     * getter de la hauteur
     * @return  hauteur de la carte
     */
    public Hauteurs getHauteur() {
        return hauteur;
    }
    
    public Couleurs getCouleur() {
    	return this.couleur;
    }
}
