package emr.ing;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tarjeta {
	
	protected double saldo;
	protected double valorBoleto;
	protected double valorTrasbordo;
	protected ArrayList<Viaje> viajes;
	
	public void recarga(float monto){
		
		if(monto >= 0 && monto < 196)
			saldo += monto;
		else if(monto >= 196 && monto < 368)
			saldo += monto + 34;
		else if(monto >= 368)
			saldo += monto + 92;		
	}
	
	public boolean pagarBoleto(Colectivo colectivo, Date horario){
		
		//Falta implementar el horario del medio boleto
		
		Viaje viaje = new Viaje(valorBoleto, colectivo, horario);
		
		if(esTrasbordo(viaje)){
			if(saldo >= valorTrasbordo)
				saldo -= valorTrasbordo;
			else
				return false;
		}
		else{
			if(saldo >= valorBoleto)
				saldo -= valorBoleto;
			else return false;
		}
		
		viajes.add(viaje);
		
		return true;
	}
	
	public double saldo(){
		
		return saldo;
	}
	
	public ArrayList<Viaje> viajesRealizados(){
		
		return viajes;
	}
	
	public boolean esTrasbordo(Viaje viaje){
		
		if(viajes.size()>1){			
			Viaje anterior = viajes.get(viajes.size() - 1);	
			long diferencia = anterior.getHorario().getTime() - viaje.getHorario().getTime();
			long minutos = TimeUnit.MILLISECONDS.toMinutes(diferencia);
			if(anterior.getColectivo() != viaje.getColectivo() &&			
			minutos >= 0 && minutos <= 1 )
			//Falta agregar condicion para que trasbordo sea el unico de la hora
				return true;				
		}
		
		return false;
	}
}
