import java.util.StringTokenizer;

public class CamelCase {

	
	public static void camelCase(String cadena) {
		
		String token;
		char primera;
		StringBuilder str = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(cadena);
	    while (st.hasMoreTokens()) {
	    	
	    	token = st.nextToken();
	    	primera = token.charAt(0);
	    	str.append(token.replaceFirst(""+primera, ""+Character.toUpperCase(primera)));
	    }
	    
	    System.out.println(str);
		
	}
}
