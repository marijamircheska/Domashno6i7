package zad5a;

import java.util.Set;
import java.util.TreeSet;

public class Glavna5a {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("Zelena");
		mnozestvo1.add("Crna");
		mnozestvo1.add("Crvena");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("Zelena");
		mnozestvo2.add("Zolta");
		mnozestvo2.add("Plava");

		System.out.println("Presek od dvete mnozestva");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);

	}
}
