package stringvsbuilder;

import java.util.Random;

import etudiant.Etudiant;
import etudiant.Genre;

public class StringVsBuilder {

	public static void main(String[] args) {
		
		Etudiant etudiants[] = new Etudiant[10000000];
		
		Random r = new Random();
		
		long before = System.currentTimeMillis();
		for(int e = 0; e < 10000000; e++) {

			String prenom = "";
			char lettre = (char)(65+r.nextInt(26));
			prenom += lettre;
			for(int i = 0; i<r.nextInt(5) ;i++){
				lettre = (char)(97+r.nextInt(26));
				prenom+= lettre;
			}

			String nom = "";
			lettre = (char)(65+r.nextInt(26));
			nom += lettre;
			for(int i = 0; i<r.nextInt(5) ;i++){
				lettre = (char)(97+r.nextInt(26));
				nom += lettre;
			}
			Genre genre = r.nextBoolean() ? Genre.HOMME : Genre.FEMME;
			etudiants[e] = new Etudiant(prenom,nom,genre);

		}
		long after = System.currentTimeMillis();
		System.out.println(after-before);

		before = System.currentTimeMillis();
		for(int e = 0; e < 10000000; e++) {
			StringBuilder prenom = new StringBuilder();
			char lettre = (char)(65+r.nextInt(26));
			prenom.append(lettre);
			for(int i = 0; i<r.nextInt(5) ;i++){
				lettre = (char)(97+r.nextInt(26));
				prenom.append(lettre);
			}

			StringBuilder nom = new StringBuilder();
			lettre = (char)(65+r.nextInt(26));
			nom.append(lettre);
			for(int i = 0; i<r.nextInt(5) ;i++){
				lettre = (char)(97+r.nextInt(26));
				nom.append(lettre);
			}
			Genre genre = r.nextBoolean() ? Genre.HOMME : Genre.FEMME;
			etudiants[e] = new Etudiant(prenom.toString(),nom.toString(),genre);
			
		}
		after = System.currentTimeMillis();
		System.out.println(after-before);
		
	}

}
