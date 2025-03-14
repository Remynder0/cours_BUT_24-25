import java.util.Comparator;

public class StringComparator implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        if (o1.nom != o2.nom) return o1.nom.compareTo(o2.nom);
        if(o1.prenom != o2.prenom) return o1.prenom.compareTo(o2.prenom);
        return o1.formation.compareTo(o2.formation);
    }
}
