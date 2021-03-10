import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoDigitos {

	public static void ordenamientoDigitos(long numero) {
		
		System.out.println("Entrada: " + numero);
		StringBuilder res = new StringBuilder();
		ArrayList<String> al = new ArrayList<>();
		String number = String.valueOf(numero);
	    char[] digits1 = number.toCharArray();

	    for(int i = 0; i < digits1.length; i++) {
	        al.add(String.valueOf(digits1[i]));
	    }		
	    Collections.sort(al, Collections.reverseOrder()); 
  
	    for (String d : al) {
			res.append(d);
		}
	    System.out.println("Salida: " + res);
	}
	
}
