package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class CSVParser {
	
	public static HashMap<String, LinkedList<Match>> parseSaison(String nomDeFichier){
		Path file = Path.of(nomDeFichier);
		BufferedReader br = null;
		
		HashMap<String, LinkedList<Match>> saison = new HashMap<String, LinkedList<Match>>();
		try {
			br = Files.newBufferedReader(file);
		} catch (IOException e) {
			System.out.println(nomDeFichier+" not found");
			System.exit(-1);
		}
		
		String ligne = null;
		
	    try {
			while ((ligne = br.readLine()) != null) {
				
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Something went wrong");
		}
	    
	    return saison;
	}
	
	public static HashMap<String, ArrayList<HashMap<String, Double>>> parseEquipes(String nomDeFichier){
		Path file = Path.of(nomDeFichier);
		BufferedReader br = null;
		
		HashMap<String, ArrayList<HashMap<String, Double>>> teams = new HashMap<String, ArrayList<HashMap<String, Double>>>();
		try {
			br = Files.newBufferedReader(file);
		} catch (IOException e) {
			System.out.println(nomDeFichier+" not found");
			System.exit(-1);
		}
		
		String ligne = null;
		
		
	    try {
			while ((ligne = br.readLine()) != null) {
		
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Something went wrong");
		}
	    return teams;
	}
}
