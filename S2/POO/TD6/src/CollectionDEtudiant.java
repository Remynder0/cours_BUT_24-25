import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionDEtudiant {
    public static void main(String[] args) {
        LinkedList<Etudiant> listeDEtudiants = new LinkedList<Etudiant>();

        listeDEtudiants.add(new Etudiant("RT", "Alban", "Fourrier"));
        listeDEtudiants.add(new Etudiant("INFO", "Bert", "Germain"));
        listeDEtudiants.add(new Etudiant("RT", "Alban", "Fourrier"));
        listeDEtudiants.add(2, new Etudiant("INFOCOM", "Sophie", "Herzig"));


        listeDEtudiants.add(new Etudiant("INFO", "Agnes", "Nutter"));

        System.out.println(listeDEtudiants);

        HashSet<Etudiant> ensembleDEtudiants = new HashSet<Etudiant>(listeDEtudiants);
        System.out.println(ensembleDEtudiants);

        PriorityQueue<Etudiant> pqDEtudiants = new PriorityQueue<Etudiant>(new StringComparator());
        for(Etudiant e : listeDEtudiants){
            pqDEtudiants.add(e);
        }

        while(!pqDEtudiants.isEmpty()){
            System.out.println(pqDEtudiants.remove());
        }

    }
}

