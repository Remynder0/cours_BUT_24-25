package exo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LireEtudiants implements AutoCloseable{
    private BufferedReader reader;
    private BufferedWriter writer;
    private List<Etudiants> etudiants = new ArrayList<>();


    public LireEtudiants(String filePath, String outputFilePath) throws IOException {
        Path path = Paths.get(filePath);
        this.reader = Files.newBufferedReader(path);
        this.writer = new BufferedWriter(new FileWriter(outputFilePath));
    }

    public void lireEtAfficherEtudiants(String filePath){
        try (LireEtudiants lecteur = new LireEtudiants(filePath)) {
            String line;
            while ((line = lecteur.reader.readLine())!= null) {
                Etudiants etudiant = new Etudiants(line);
                System.out.println("Nom: " + etudiant.getNom() + ", Heures: " + etudiant.getHeures() + ", Crédits: " + etudiant.getCredits());
                etudiants.add(etudiant);
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
    }

    public void ecrireEtudiants() throws IOException {
        for (Etudiants etudiant : etudiants) {
            writer.write(etudiant.toString());
            writer.newLine();
        }
        writer.close();
    }

    public List<Etudiants> getEtudiants() {
        return etudiants;
    }


    @Override
    public void close() throws Exception {
        if(reader != null){
            reader.close();
        }
    }

    public static void main(String[] args) {
        LireEtudiants lecteur = new LireEtudiants(args[0]);
        lecteur.lireEtAfficherEtudiants(args[0]);
        lecteur.close();
    }
}
