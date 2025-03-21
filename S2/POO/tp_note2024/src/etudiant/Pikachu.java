package etudiant;

import sujet.EnumType;
import sujet.Pokemon;
import sujet.SourceLumineuse;

public class Pikachu extends Pokemon implements SourceLumineuse {
    private static int default_attaque = 28;
    private static int default_vie = 50;
    private static final EnumType typeClasse;

    static {
        typeClasse = EnumType.ELECTRIK;
    }

    public Pikachu() {
        super("Pikachu", default_attaque, default_vie, typeClasse);
    }

    public Pikachu(String nom, int attaque, int vieMax) {
        super(nom, attaque, vieMax, typeClasse);
    }

    @Override
    public String eclairer() {
        return this.getNom()  + "envoie un arc electrique et eclaire les lieux.";
    }
}
