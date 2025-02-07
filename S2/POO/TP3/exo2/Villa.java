package exo2;

public class Villa extends Batiment{
    int nbpieces;
    boolean piscine;

    public Villa(String n, String a, int s, int nbp, boolean p) {
        super(n, a, s);
        nbpieces = nbp;
        piscine = p;
    }

    public Villa(String n, String a, int s) {
        this(n, a, s, 4, false);
    }


    @Override
    public void afficher(){
        super.afficher();
        System.out.print("\nNombre de pièce : "+nbpieces+"\nPiscine : "+piscine);
    }

    @Override
    public int getImpot(){
        if(piscine) return 100*nbpieces+500;
        return 100*nbpieces;
    }
    @Override
    public int getCategorie(){
        return 2;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(obj instanceof Villa){
            Villa v = (Villa) obj;
            return v.nbpieces == nbpieces && v.piscine == piscine && super.equals(obj);
        }
        return false;
    }

}
