import java.lang.Object;


public class Animal{
      protected float poids;
      protected float taille;
      protected boolean dents;
      protected String nom;

      Animal(float p,float t,boolean d,String nom){
          poids=p;taille=t;dents=d;this.nom=nom;
      }

      public void set(float p, float t, Boolean d, String nom) {
          poids=p; taille=t; dents=d; this.nom=nom;
      }

    public void mange() {
        System.out.println(nom+" mange");
    }

    
    public String toString() {
        String res="Animal ("+nom+") de "+poids+"kg, de "+taille+" cm";
        if (dents) res+=" avec des dents.\n";

        return res ;
      }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return  false;
        if (!(obj instanceof Animal)) return false;
        if (this == obj) return true;

        return this.poids == ((Animal) obj).poids && this.taille == ((Animal) obj).taille && this.dents == ((Animal) obj).dents && this.nom.equals(((Animal) obj).nom);
    }

    @Override
    public Animal clone() {
        return new Animal(poids, taille, dents, nom);
    }

    
            
}


    
    class Mammifere extends Animal {
        protected int nbreMamelles;
        protected float rythmeCardiaque;


        public Mammifere(float p, float t, boolean d, String nom, int n, float r){
            super(p, t, d, nom);
            nbreMamelles = n; rythmeCardiaque = r;
        }

        @Override
        public String toString() {
            return super.toString() + "C'est un mammifère avec "+nbreMamelles+" mamelles et un rythme cardiaque de "+rythmeCardiaque+" bpm\n";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return  false;
            if (!(obj instanceof Mammifere)) return false;
            if (this == obj) return true;

            return super.equals(obj) && this.nbreMamelles == ((Mammifere) obj).nbreMamelles && this.rythmeCardiaque == ((Mammifere) obj).rythmeCardiaque;
        }

        @Override
        public Mammifere clone() {
            return new Mammifere(poids, taille, dents, nom, nbreMamelles, rythmeCardiaque);
        }

    }


  class testmam {
      public static void main(String args[]){
          Mammifere vache = new Mammifere(155.5f,1.20f,true,"margeritte",4,95.3f);
          System.out.println(vache.toString());
          vache.mange();

          System.out.println();
      }
  }


