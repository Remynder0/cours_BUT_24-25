package bataille;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;

/**
 * gere un paquet de cartes
 */

public class PaquetCartes {
    private ArrayList<Carte> paquet;
    private Joueur joueur;

    /**
     * cree un paquet vide
     */

    public PaquetCartes() {

    }

    /**
     * ajoute une carte au paquet
     * @param c  une carte
     */
    public void ajouter(Carte c){
        this.paquet.add(c);
    }

    /**
     * @return une chaine de caractères contenant la description de l'ensemble des cartes du paquet.
     */
    @Override
    public String toString() {
        String s = "";
        if (paquet.size() != 0){
            for (int i = 0; i < paquet.size(); i++) {
                s += " " + paquet.get(i) + ", ";
                if ((i % 4) == 3) s += "\n";
            }
        }
        return s;
    }

    /**
     * mélange un paquet de cartes
     */
    public void melanger(){
        int nbcartes = paquet.size();
        Random rand = new Random();
        int nbmelange=nbcartes*10;

        for (int i=0; i<nbmelange; i++){
            int position = rand.nextInt(nbcartes);
            Carte c=paquet.remove(position);
            paquet.add(c);
        }
    }

    /**
     *
     * @return le nombre de cartes du paquet
     */
    public int getNbCartes(){
        return paquet.size();
    }

    /**
     *
     * @return true si le paquet est vide, false sinon
     */
    public boolean estPaquetVide(){
        return paquet.size()==0;
    }

    /**
     *
     * @return la carte du dessus du paquet. La carte est supprimee du paquet.
     */
    public Carte tirerCarteDessus() throws ExceptionDeTasVide {
        if (paquet.isEmpty()) {
            throw new ExceptionDeTasVide(this.joueur);
        }
        return paquet.remove(0);

    }

    /**
     * ajoute une carte en dessous du paquet
     * @param c  une carte
     */
    public void mettreCarteDessous(Carte c){
        paquet.add(c);
    }


    public void ajouterCarte(Carte carte) {
    }
}
