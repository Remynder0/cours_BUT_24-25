package etudiant;

import sujet.*;

import java.util.ArrayList;

public class EquipePokemons {
    ArrayList <Pokemon> equipe = new ArrayList<Pokemon>();
    int nbMembres = 6;

    public ArrayList equipePrincipal() {
        equipe.add(new Tortank());
        equipe.add(new Rhinocorne());
        equipe.add(new Lokhlass());
        equipe.add(new Alakazam("psycho", 48, 85));

        return equipe;
    }

    @Override
    public String toString() {
        return "EquipePokemons ["
                + equipe.get(0).toString() + "\n"
                + equipe.get(1).toString() + "\n"
                + equipe.get(2).toString() + "\n"
                + equipe.get(3).toString() + "\n"
                + equipe.get(4).toString() + "\n"
                + equipe.get(5).toString() + "\n"+"]";
    }
}
