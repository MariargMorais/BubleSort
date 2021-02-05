package main;

import java.util.ArrayList;

public class InserctionSort {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(4);
		lista.add(7);
		lista.add(2);
		lista.add(5);
		lista.add(4);
		lista.add(0);

		int chave;
		int j;
		for (int a = 0; a < lista.size(); a++) {
			System.out.println(lista.get(a));
		}
		for (int i = 1; i < lista.size(); i++) {
			chave = lista.get(i);
			j = i - 1;
			while ((j >=0) && (lista.get(j) > chave)) {
				lista.set(j + 1, lista.get(j));
				j-=1;
			}
			lista.set(j + 1, chave);
		}

		System.out.println("Ordenada:");
		for (int a = 0; a < lista.size(); a++) {

			System.out.println(lista.get(a));
		}
	}

}
