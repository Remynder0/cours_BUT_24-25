package ex1;

public class Generateur {
    private int val;

    public Generateur(int val) {
        this.val = val;
    }

    public void uneMethode(int i) throws MonException {
        if (i == val)
            throw new MonException("Oups, l'exception est levée");
    }
}


