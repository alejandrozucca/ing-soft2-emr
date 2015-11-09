package emr.ing;

import java.util.ArrayList;

public class TarjetaMedioBoleto extends Tarjeta {
	
	public TarjetaMedioBoleto(){
		viajes = new ArrayList<Viaje>();
		saldo = 0;
		valorBoleto = 2.90;
		valorTrasbordo = 0.96;
	}
	
}
