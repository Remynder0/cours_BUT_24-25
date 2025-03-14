package employes;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


public class Entreprise {
	private Employe[] employes;

	public Entreprise() {
		this.employes = new Employe[4];
		this.employes[0] = new EmployeHoraire("Jean");
		this.employes[1] = new EmployeHoraire("Pierre");
		this.employes[2] = new Commercial("Marie");
		this.employes[3] = new Commercial("Paul");
	}

	public void afficherEmploye() {
		for (Employe employe : employes) {
			System.out.println(employe.toString());
		}
	}

	public void sauvegarderEmployeDansFichier() {
		Path path = Paths.get("employes.txt");
		try {
			Files.writeString(path, "");
			for (Employe employe : employes) {
				System.out.println(employe);
				Files.write(path, (employe + "\n").getBytes(), StandardOpenOption.APPEND);

			}
		} catch (IOException e) {
			System.err.println("Erreur lors de la sauvegarde des employés : " + e.getMessage());
		}
	}

	public void lireEmployeDansFichier() {
		try (BufferedReader reader = new BufferedReader(new FileReader("employes.txt"))) {
			String ligne;
			int numligne = 1;
			while ((ligne = reader.readLine()) != null) {
				System.out.println(numligne+" : "+ligne);
				numligne++;
			}
		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture des employés : " + e.getMessage());
		}
	}

	public Employe[] recreerInstance() {
		Employe[] employes = new Employe[4];

		try (BufferedReader reader = new BufferedReader(new FileReader("employes.txt"))) {
			String ligne;
			int numligne = 0;
			while ((ligne = reader.readLine()) != null) {
				String typeEmploye = ligne.split(",")[0];
				if(typeEmploye.equals("EmployeHoraire")){
					employes[numligne] = new EmployeHoraire(ligne.split("=")[1].split("]")[0]+"2");
				}
				else if(typeEmploye.equals("Commercial")){
					employes[numligne] = new Commercial(ligne.split("=")[1].split("]")[0]+"2");
				}

				numligne++;
			}
		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture des employés : " + e.getMessage());
		}
		return employes;
	}

	public void ecrireEmployesDansFichier() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employes.bin"))) {
			for (Employe employe : employes) {
				oos.writeObject(employe);
			}
		} catch (IOException e) {
			System.err.println("Erreur lors de l'écriture des employés dans le fichier : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		Entreprise entreprise = new Entreprise();
		entreprise.sauvegarderEmployeDansFichier();
		entreprise.lireEmployeDansFichier();
		Employe[] employes = entreprise.recreerInstance();
		for (Employe employe : employes) {
			System.out.println(employe);
		}
		entreprise.ecrireEmployesDansFichier();
	}
}
