public class Courge {
    private float poids;
    private int emplacement;
    private boolean disponible;

    public Courge(float poids, int emplacement, boolean disponible) {
        this.poids = poids;
        this.emplacement = emplacement;
        this.disponible = disponible;
    }

    public int getEmplacement(){
        return emplacement;
    }

    public float getPoids(){
        return poids;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setPoids(float nouveauPoids) {
        this.poids = nouveauPoids;
    }

    @Override
    public String toString() {
        return "{" +
                "poids=" + poids +
                ", emplacement=" + emplacement +
                ", disponible=" + disponible +
                '}';
    }

}
