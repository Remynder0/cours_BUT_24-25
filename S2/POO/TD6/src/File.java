public interface File {

    /** Retourne si la file est vide */
    public boolean estVide();

    /** Ajoute un élément en queue de file */
    public void entrer(Object o);

    /** Retourne l'élément en tête de file */
    public Object sortir();
}


