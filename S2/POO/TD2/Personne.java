package TD2;

public class Personne {

    private String nom;
    private String adresse;
    private int age;

    // Constructeur par défaut
    public Personne(){
        this("", "", 0);
    }

    public Personne(String adresse, String nom, int age) {
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Personne [nom="+nom+", adresse="+adresse+", age="+age+"]";
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return  false;
        if (!(o instanceof Personne)) return false;

        Personne p = (Personne) o;
        return p.age== age && p.adresse.equals(adresse) && p.nom.equals(nom);

    }
}
