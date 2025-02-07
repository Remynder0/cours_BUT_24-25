package exo1;

public class CompteEpargne extends Compte {
    private float tauxInteret;
    private int nbAnnee;

    public CompteEpargne(String id, float s, float taux){
        super(id, s);
        tauxInteret = taux;
        nbAnnee = 0;
    }

    @Override
    public float getSolde(){
        return super.getSolde() * (1 + tauxInteret * nbAnnee);
    }

    public void setAnnees(int nb){
        nbAnnee = nb;
    }

    @Override
    public String getNatureCompte () {
        return "compte avec interet";
    }
}
