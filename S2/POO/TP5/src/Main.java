public class Main {
    public static void main(String[] args) {

        System.out.println(Planet.EARTH);
        for (Planet planet : Planet.values()) {

            planet.afficherPosition();
            planet.suivant();
        }
        System.out.println(TypesDeplanetes.EARTH.type());
    }
}