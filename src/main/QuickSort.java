package main;

public class QuickSort {

	public static void quicksort(int[] A) {
		quicksort(A, 0, A.length - 1);
		
	}

	private static void quicksort(int[] A, int inicio, Integer fim) {

		if (inicio < fim) {
			int pivot = partition(A, inicio, fim);
			quicksort(A, inicio, pivot - 1);
			quicksort(A, pivot + 1, fim);
		}
	}

	private static int partition(int[] A, int inicio, int fim) {

		int pivot = A[fim];

		int barraAmarela = inicio;

		int aux;

		for (int barraRoxa = 0; inicio< fim ; barraRoxa++) {
			if (A[barraRoxa] <= pivot) {
				aux = A[barraRoxa];
				A[barraRoxa] = A[barraAmarela];
				A[barraAmarela] = aux;
				A[barraAmarela] += 1;
				
			}
			//inicio++;
		}
		aux = A[barraAmarela];
		A[barraAmarela] = A[fim];
		A[fim] = aux;

		return barraAmarela;

	}
	@SuppressWarnings("unused")
	public static void Imprimir(int[] A) {
		for (int num=0;num<A.length;num++) {
			System.out.println(A[num]);
		}
	}
}
