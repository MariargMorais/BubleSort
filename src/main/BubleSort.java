package main;

import java.util.ArrayList;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(4);
		lista.add(9);
		lista.add(2);
		lista.add(1);
		lista.add(7);
		lista.add(8);

		for (int a = 0; a < lista.size(); a++) {
			System.out.println(lista.get(a));
		}

		for (int j = 0; j < lista.size() - 1; j++) {
			for (int i = 0; i < lista.size() - 1; i++) {
				if (lista.get(i) > lista.get(i + 1)) {
					int aux = lista.get(i + 1);
					lista.set(i + 1, lista.get(i));
					lista.set(i, aux);
				}
			}

		}
		System.out.println("Ordenada:");
		for (int a = 0; a < lista.size(); a++) {
			System.out.println(lista.get(a));
		}

	}

}
