package emr.ing;

import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		TarjetaMedioBoleto tarjeta;
		
		tarjeta = new TarjetaMedioBoleto();
		
		tarjeta.recarga(196);
		
		Colectivo c130 = new Colectivo("Semtur", 130);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		
		
		tarjeta.pagarBoleto(c130, date);
		
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39

	}

}
