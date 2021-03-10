
public class BinarioAEntero {

	
	public static void obtenerEntero(int [] array) {
		
		int sumTotal = 0;
		int tamArray = 4;
		int cont = 1;
		int potencia = 0; 
		
		for(int i=0;i<4;i++) {
			potencia = tamArray - cont;
			sumTotal += array[i] * Math.pow(2, potencia);
			cont++;
		}
		
		System.out.println("valor entero: " + sumTotal);
	}

}
