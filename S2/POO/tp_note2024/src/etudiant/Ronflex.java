package etudiant;

import sujet.EnumType;
import sujet.KoException;
import sujet.Pokemon;

public class Ronflex extends Pokemon {
    private static int default_attaque = 38;
    private static int default_vie = 180;
    private static final EnumType typeClasse;

    static {
        typeClasse = EnumType.NORMAL;
    }

    public Ronflex() {
        super("Ronflex", default_attaque, default_vie, typeClasse);
    }

    public Ronflex(String nom, int attaque, int vieMax) {
        super(nom, attaque, vieMax, typeClasse);
    }


    @Override
    public void subirDegats(double degats, EnumType typeAttaque) {
        int degatReel = (int)(degats * typeAttaque.getEfficaciteSur(this.getType()));
        if(typeAttaque == EnumType.GLACE || typeAttaque == EnumType.FEU) degatReel /= 2;
        if (degatReel >= this.vie) {
            this.vie = 0;
        } else {
            this.vie -= degatReel;
        }
    }
}
