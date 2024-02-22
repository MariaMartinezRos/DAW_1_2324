package RepasoGlobalArrays;

import java.sql.Date;
import java.text.SimpleDateFormat;

/* Array10.java
 * 
 * Escribe un método que se llame fechaActual() devuelva una cadena con la fecha actual en formato dd/mm/aaaa. 
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array10{
	
	public static void main(String[] args) {
		
		System.out.println(fechaActual());
		
		
		
	}
	
	public static String fechaActual() {
		
		Date fecha = new Date(System.currentTimeMillis());
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		return formato.format(fecha);
	
	}
	
	

}