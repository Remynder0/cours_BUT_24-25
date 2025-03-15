package bataille;

public class ExceptionDeTasVide  extends Exception {
    private Joueur joueur;

    public ExceptionDeTasVide(Joueur joueur){
        super("Tas vide pour le joueur : " + joueur.getNom());
        this.joueur = joueur;
    }

    public Joueur getJoueur(){
        return joueur;
    }
}

