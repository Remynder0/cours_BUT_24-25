package exo2;

public class Paie {
    public static void main(String[] args) {
        Employe[] employes = new Employe[3];

        employes[0] = new EmployeHoraire("Dupont", 15.0, 45);
        employes[1] = new Commercial("Dupontons", 1000, 3900);
        employes[2] = new EmployeHoraire("Jean", 13.0, 40);

        for (Employe employe : employes) {
            System.out.println(employe.getNom() + " gagne " + employe.getSalaire() + " euros.");
        }
    }
}

