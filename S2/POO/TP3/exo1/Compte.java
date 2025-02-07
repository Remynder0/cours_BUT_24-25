package exo1;

public class Compte {
    protected final String identifiant;
    protected float solde;

    public Compte(String id, float s){
        identifiant = id;
        solde = s;
    }

    public float getSolde(){
        return solde;
    }
    public String getIdentifiant() {
        return identifiant;
    }

    public String getNatureCompte () {
        return "compte simple";
    }


}

