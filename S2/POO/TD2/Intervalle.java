package TD2;

public class Intervalle {
    // Attributs privés
    private int min;
    private int max;

    // Constructeur par défaut
    public Intervalle() {
        this.min = 0;
        this.max = 0;
    }

    public Intervalle(int borne1, int borne2) {
        this.setMinMax(borne1, borne2);
    }

    public void setMinMax(int borne1, int borne2){
        if (borne1 < borne2) {
            this.min = borne1;
            this.max = borne2;
        } else {
            this.min = borne2;
            this.max = borne1;
        }
    }

    public String toString(){
        return "["+min+" ; "+max+"]";
    }

    public void afficher(){
        System.out.println(" L’intervalle a pour borne inférieure "+min+" et pour borne supérieure"+max);
    }

    public int longueur(){
        return max-min;
    }

    public boolean estIncluse(int valeur){
        return valeur >= min || valeur <= max;
    }

    public boolean equals(Intervalle other){
        if(other == null ) return false;
        return other.min == this.min && other.max == this.max;
    }

    public boolean contient(Intervalle other){
        if(other == null ) return false;
        if (equals(other)) return true;
        return estIncluse(other.min) || estIncluse(other.max);
    }

    public Intervalle intersection(Intervalle other){
        if (equals(other)) return other;
        
        Intervalle i = new Intervalle();
        
        if (other.min >= this.min) i.min = other.min;
        else i.min = this.min;

        if (other.max <= this.max) i.max = other.max;
        else i.max = this.max;

        return i;
    }
}