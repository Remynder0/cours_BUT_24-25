package TP6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		LinkedList<Double> linked = new LinkedList<>();
		ArrayList<Double> array = new ArrayList<>();
		HashSet<Double> hashset = new HashSet<>();
		List<Collection<Double>> ensemble = Arrays.asList(linked, array, hashset);
		Random rand = new Random();

		mesureTime(ensemble, "Question 2 (Ajout en début de liste) : ", l -> {
			/**
			 * La méthode add(index, element) appartient à l'interface List et non
			 * Collection, il faut donc faire un filtre.
			 */
			if (l instanceof List) {
				List<Double> listDouble = (List<Double>) l;
				for (int i = 0; i < 100000; i++) {
					listDouble.add(0, rand.nextDouble());
				}
			} else {
				System.err.println("Pas d'ajout en début de liste pour la classe " + l.getClass().getSimpleName());
			}
		});
	}

	/**
	 * 
	 * @param list     Liste contenant l'ensemble des collections sur lequel on
	 *                 exécute la {@link #function}.
	 * @param label    Message pour se repérer dans l'exécution.
	 * @param function Bout de code à exécuter sur chacune des collections reçues en
	 *                 paramètre.
	 */
	public static void mesureTime(List<Collection<Double>> list, String label, Consumer<Collection<Double>> function) {
		for (Collection<Double> collection : list) {
			long start = System.currentTimeMillis();
			function.accept(collection);
			long end = System.currentTimeMillis();
			System.out.printf("%s classe : %s, temps : %d\n", label, collection.getClass().getSimpleName(),
					end - start);
		}
	}
}
