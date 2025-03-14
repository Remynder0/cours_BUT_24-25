package etudiant;

import java.util.ArrayList;

public class Etudiant{
	
	private String prenom;
	private String nom;
	private Genre genre;
	private ArrayList<Double> notes;
	
	public Etudiant(String prenom, String nom, Genre genre) {
		
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.notes = new ArrayList<Double>();
	}
	
	public void ajouterNote(double note) {
		this.notes.add(note);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.prenom);
		sb.append(", ");
		sb.append(this.nom);
		sb.append(", ");
		sb.append(this.genre);
		sb.append("\n");
		
		return sb.toString();
	}

}
