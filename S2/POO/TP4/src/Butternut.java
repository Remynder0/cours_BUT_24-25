public class Butternut extends Courge {
    float prix;

    public Butternut(float poids, int emplacement, boolean disponible) {
        super(poids, emplacement, disponible);
        this.prix = 2.5f;
    }

    public float getPrix() {
        return prix*this.getPoids();
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Butternut [prix=" + prix + ", " + super.toString() + "]";    }
}

