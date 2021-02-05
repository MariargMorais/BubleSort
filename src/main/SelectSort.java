package main;

import java.util.ArrayList;

public class SelectSort {
	public static void main(String args[]) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(7);
		lista.add(5);
		lista.add(1);
		lista.add(8);
		lista.add(3);
		
		for (int a = 0; a < lista.size(); a++) {
			System.out.println(lista.get(a));
		}
		
		
		int aux;
		for (int j = 0; j < lista.size() - 1; j++) {
			int minIndex = j;

			for (int i = j + 1; i < lista.size(); i++) {
				if (lista.get(i) < lista.get(minIndex)) {
					minIndex = i;
				}

			}

			aux = lista.get(j); // salvo na auxiliar o valor da posição j
			lista.set(j, lista.get(minIndex)); // coloco na posição j, o valor da posição do minimo indice
			// lista.set(minIndex, j);
			lista.set(minIndex, aux);// coloco na posição do minimo indice, o valor da auxilar
			// lista.set(aux, minIndex);

		}
		System.out.println("Ordenada:");
		for (int a = 0; a < lista.size(); a++) {
			
			System.out.println(lista.get(a));
		}
	}
}
