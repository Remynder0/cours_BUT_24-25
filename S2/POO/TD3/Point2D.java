// Classe représentant un point dans un plan 2D
public class Point2D {
    private double x; // Coordonnée X
    private double y; // Coordonnée Y

    // Constructeur : initialise les coordonnées
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter pour X
    public double getX() {
        return x;
    }

    // Setter pour X
    public void setX(double x) {
        this.x = x;
    }

    // Getter pour Y
    public double getY() {
        return y;
    }

    // Setter pour Y
    public void setY(double y) {
        this.y = y;
    }

    // Méthode equals : compare deux points pour vérifier leur égalité
    @Override
    public boolean equals(Object obj) {
        // Vérification si l'objet passé en paramètre est null ou d'une autre classe
        if (this == obj) return true; // Comparaison par référence
        if (obj == null || getClass() != obj.getClass()) return false;

        Point2D point = (Point2D) obj;

        // Comparaison des coordonnées X et Y
        return Double.compare(point.x, x) == 0 &&
               Double.compare(point.y, y) == 0;
    }

    // Représentation textuelle du point
    @Override
    public String toString() {
        return "Point2D(" + "x=" + x + ", y=" + y + ')';
    }
}