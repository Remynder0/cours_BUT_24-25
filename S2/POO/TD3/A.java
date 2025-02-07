public   class A {
    int numero;

    A( int n){
        numero = n;
    }
    public String toString () {
        return "mon numero est : " + numero;
    }
}
    

class B extends A {
    String nom;

    B(int n, String nom) {
         super(n);
         this.nom = nom;
    }

    public String toString() {
        return super.toString() + " et mon nom est" + nom;
    }
}

         class testAB {
             public static void main(String args[]){
                 A objet_a = new A(5);
                 B objet_b = new B(6, " objet b");
                 System.out.println(objet_a);
                 System.out.println(objet_b);
             }
         }