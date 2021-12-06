package zad10;

import java.util.ArrayList;
import java.util.List;

public class Glavna10 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Plava");
		l1.add("Zholta");
		l1.add("Zelena");
		List<String> l2 = new ArrayList<String>();
		l2.add("Crvena");
		l2.add("Portokalova");
		l2.add("Kafena");

		l1.addAll(l2);

		System.out.println(l1);
	}
}