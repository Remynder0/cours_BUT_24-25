package monAppliPack;

import domaine.Operation;
import domaine.Personne;

public class Application {

	public Application() {
		System.out.println("Constructeur d'Application");	
	}

	public static void main(String[] args) {
		System.out.println("Méthode main");
		Application monAppli = new Application();
		monAppli.lancer();
	}

	private void lancer() {
		System.out.println("Méthode Lancer");
		Personne per = new Personne("L","R");
		Operation op = new Operation(5,6);
		
	}

}
