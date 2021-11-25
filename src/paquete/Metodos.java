package paquete;

public class Metodos {

	public static void main(String[] args) {
		
		int[] array = new int [20];
		valoresRandomArray(array, 1, 10);
		recorrerAr(array);
		
	}

	/**
	 * Devuelve un array con numeros aleatorios segun un intervalo de numeros
	 * seleccionado
	 * @param m Array a la cual se le agregaran los valores random
	 * @param x Valor MINIMO del que pueden partir los numeros aleatorios
	 * @param y Valor MAXIMO al que pueden llegar los numeros aleatorios
	 * @return
	 */
	public static int[] valoresRandomArray(int[] a, int x, int y) {

		//Agrega valores numericos random a un array
		for (int i = 0; i < a.length; i++) {
				a[i] = (int) (Math.random() * (y + 1 - x)) + x;
			}
	
		return a;
	}
	
	/**
	 * Recorre e imprime un array entre llaves y separados los valores por comas
	 * 
	 * @param a Array el cual se desea recorrer
	 * @return
	 */
	public static void recorrerAr(int[] a) {

		//Dibuja e imprime los valores del array
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}

	
}
