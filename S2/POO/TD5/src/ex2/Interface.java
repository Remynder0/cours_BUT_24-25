package ex2;

interface InterfaceValeur {
    public int valeur();

    int valeurBis();
}

class A implements InterfaceValeur {
    private int nombre;

    A(int n) {
        this.nombre = n;
    }

    public int valeur() {
        return nombre;
    }

    public String toString() {
        return "(" + nombre + ")";
    }

    public int valeurBis() {
        return 5 * valeur();
    }
}

class B implements InterfaceValeur {
    private String couleur;

    B(String c) {
        this.couleur = c;
    }

    public int valeur() {
        if (couleur.equals("rouge")) return 1;
        else return -1;
    }

    public String toString() {
        return "(" + couleur + ")";
    }

    public int valeurBis() {
        return 2 * valeur();
    }
}

class Test {
    public static void main(String[] args) {
        InterfaceValeur[] tab = new InterfaceValeur[2];
        tab[0] = new B("rouge");
        tab[1] = new A(5);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            System.out.println(tab[i].valeur());
            System.out.println(tab[i].valeurBis());
        }
    }
}
