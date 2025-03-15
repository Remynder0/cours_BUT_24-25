package ex1;

public class ExempleSimple2 {

    public void premierTest(Generateur gen) {
        System.out.println("Premier test:");
        System.out.println("-------------");
        int v = 42;
        try {
            System.out.println("un");
            gen.uneMethode(v);
            System.out.println("deux");
        } catch (MonException e) {
            System.out.println("trois " + e.getMessage());
        }
        System.out.println("quatre");
    }

    public void secondTest(Generateur gen) {
        System.out.println("\nSecond test:");
        System.out.println("------------");
        int v = 1;
        try {
            System.out.println("un");
            gen.uneMethode(v);
            System.out.println("deux");
        } catch (MonException e) {
            System.out.println("trois " + e.getMessage());
        }
        System.out.println("quatre");
    }

    public void troisiemeTest(Generateur gen) throws MonException {
        System.out.println("\nTroisieme test:");
        System.out.println("---------------");
        int v = 42;
        System.out.println("un");
        gen.uneMethode(v);
        System.out.println("deux");
    }

    public void quatriemeTest(Generateur gen) throws MonException {
        System.out.println("\nQuatrieme test:");
        System.out.println("---------------");
        int v = 2;
        System.out.println("un");
        gen.uneMethode(v);
        System.out.println("deux");
    }

    public void cinquiemeTest(Generateur gen) throws MonException {
        System.out.println("\nCinquieme test:");
        System.out.println("---------------");
        int v = 42;
        try {
            System.out.println("un");
            gen.uneMethode(v);
            System.out.println("deux");
        } catch (MonException e) {
            System.out.println("trois " + e.getMessage());
            throw e;
        } finally {
            System.out.println("troisbis");
        }
        System.out.println("quatre");
    }

    public void sixiemeTest(Generateur gen) throws MonException {
        System.out.println("\nSixieme test:");
        System.out.println("-------------");
        int v = 2;
        try {
            System.out.println("un");
            gen.uneMethode(v);
            System.out.println("deux");
        } catch (MonException e) {
            System.out.println("trois " + e.getMessage());
            throw e;
        } finally {
            System.out.println("troisbis");
        }
        System.out.println("quatre");
    }

    public static void main(String[] args) throws MonException {
        Generateur gen = new Generateur(42);
        ExempleSimple2 exemple = new ExempleSimple2();
        exemple.premierTest(gen);
        exemple.secondTest(gen);
        try {
            exemple.troisiemeTest(gen);
        } catch (MonException e) {
            System.out.println("cinq " + e.getMessage());
        }
        try {
            exemple.quatriemeTest(gen);
        } catch (MonException e) {
            System.out.println("cinq " + e.getMessage());
        }
        try {
            exemple.cinquiemeTest(gen);
        } catch (MonException e) {
            System.out.println("cinq " + e.getMessage());
        }
        try {
            exemple.sixiemeTest(gen);
        } catch (MonException e) {
            System.out.println("cinq " + e.getMessage());
        }
        exemple.troisiemeTest(gen);
    }
}

