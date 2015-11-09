package emr.ing;

import java.util.ArrayList;

public class TarjetaComun extends Tarjeta {
	
	public TarjetaComun(){
		viajes = new ArrayList<Viaje>();
		saldo = 0;
		valorBoleto = 5.75;
		valorTrasbordo = 1.90;
	}
	
}
