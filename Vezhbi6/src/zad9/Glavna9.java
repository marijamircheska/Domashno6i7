package zad9;

import java.util.ArrayList;
import java.util.List;

public class Glavna9 {

	public static void main(String[] args) {
		List<Fakultet> lista = new ArrayList<Fakultet>();

		Fakultet f =  new Fakultet("TFB",10,1500);
		lista.add(f);
		lista.add(new Fakultet("FIKT", 5, 1000));
		lista.add(new Fakultet("FINKI", 8, 980));
		lista.add(new Fakultet("PMF", 11, 700));
		lista.add(new Fakultet("TTF", 5, 500));

		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getBrojSmerovi());
			System.out.println(lista.get(i).getVkupnoStudenti());
		}
	}
}
