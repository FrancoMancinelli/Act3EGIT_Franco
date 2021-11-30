package paquete;

public class Metodos {

	public static void main(String[] args) {
		
		int[] array = new int [30];
		valoresRandomArray(array, 1, 10);
		
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
	


}
