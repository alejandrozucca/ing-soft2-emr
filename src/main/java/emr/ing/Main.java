package emr.ing;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		TarjetaMedioBoleto tarjeta;
		
		tarjeta = new TarjetaMedioBoleto();
		
		tarjeta.recarga(196);
		
		Colectivo c130 = new Colectivo("Semtur", 130);
		
		Date ahora = new Date();
		Calendar calendar = null;
		
		calendar = Calendar.getInstance(TimeZone.getDefault());
		
		tarjeta.pagarBoleto(c130, ahora);
		
		System.out.println(calendar.getTime());

	}

}
