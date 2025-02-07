package exo2;

public class Usine extends Batiment{
    String nomEntreprise;
    int nbEmploye;
    int nbLivraisons;

    public Usine(String n, String a, int s, String nE, int nbEM, int nbLiv){
        super(n, a, s);
        nomEntreprise = nE;
        nbEmploye = nbEM;
        nbLivraisons = nbLiv;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.print("\nNom de l'entreprise : "+nomEntreprise+"\nNombre d'employé : "+nbEmploye+"\nNombre de livraisons : "+nbLivraisons);
    }

    @Override
    public int getCategorie(){
        return 1;
    }

    public int FLuxVehicule(){
        return (int) (nbLivraisons+nbEmploye*0.75);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj instanceof Usine){
            Usine u = (Usine) obj;
            return u.nomEntreprise.equals(nomEntreprise) && u.nbEmploye == nbEmploye && u.nbLivraisons == nbLivraisons && super.equals(obj);
        }
        return false;
    }
}
