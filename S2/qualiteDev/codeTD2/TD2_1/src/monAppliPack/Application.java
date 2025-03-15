package monAppliPack;

import domaine.Personne;

public class Application {

	public Application() {
		System.out.println("Constructeur d'Application");	
	}

	public static void main(String[] args) {
		System.out.println("Méthode main");
		Application monAppli = new Application();
		monAppli.lancer();
		System.out.println("application terminée");
	}

	private void lancer() {
		System.out.println("Méthode Lancer");
		Personne unePersonne = new Personne("MUDA","Robert",9,5);
		double result = unePersonne.calculer(2);
		System.out.println("Le résultats est : "+ result);
	}

}
