import java.util.ArrayList;


public class Potiron extends Courge {
    float prix;

    public Potiron(float poids, int emplacement, boolean disponible) {
        super(poids, emplacement, disponible);
        this.prix = 5;
    }

    @Override
    public String toString() {
        return "Potiron " + super.toString() + ", Prix: " + prix;
    }
}



