package zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna4 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(354);
		lista.add(485);
		lista.add(574);
		lista.add(251);
		lista.add(241);
				
		Collections.sort(lista);
		
		System.out.println(lista);
	}
}


