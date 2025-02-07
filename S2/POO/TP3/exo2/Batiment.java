package exo2;

public class Batiment {
    String nom;
    String adresse;
    int surface;

    public Batiment(String n, String a, int s){
        nom = n;
        adresse = a;
        surface = s;
    }

    @Override
    public String toString(){
        return "Le batiment "+nom+" à l'adresse "+adresse+", à une surface de "+surface+" m²";
    }

    public void afficher(){
        System.out.print("Nom : "+nom+"\nAdresse : "+adresse+"\nSurface "+surface+" m²");
    }

    public int getImpot(){
        return 5*surface;
    }

    public int getCategorie(){
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj instanceof Batiment){
            Batiment b = (Batiment) obj;
            return b.nom.equals(nom) && b.adresse.equals(adresse) && b.surface == surface;
        }
        return false;
    }

}

