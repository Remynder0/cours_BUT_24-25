public class FileTableau implements File {
    private Object[] tableau;
    private int taille;
    private int iRemplissage;
    private int iVidage;

    public FileTableau(int capacite) {
        tableau = new Object[capacite];
        taille = 0;
        iRemplissage = 0;
        iVidage = 0;
    }
    
    @Override
    public boolean estVide() {
        return false;
    }

    @Override
    public void entrer(Object o) {

    }

    @Override
    public Object sortir() {
        return null;
    }
}
