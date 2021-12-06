package zad11;

import java.util.ArrayList;
import java.util.List;

public class Glavna11 {

	public static void main(String[] args) {
		List<String> l1 =  new ArrayList<String>();
		l1.add("Plava");
		l1.add("Zelena");
		l1.add("Kafena");

		List<String> l2 = new ArrayList<String>();
		l2.add("Plava");
		l2.add("Zelena");
		l2.add("Crvena");

		l1.retainAll(l2);

		System.out.println(l1);
	}
}

