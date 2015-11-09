package emr.ing;

import java.util.ArrayList;
import java.util.Date;

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
		
		if(viajes.size()>0){			
			Viaje anterior = viajes.get(viajes.size() - 1);	
			int diferencia = anterior.getHorario().compareTo(viaje.getHorario());
			if(anterior.getColectivo() != viaje.getColectivo() &&			
			diferencia >= 0 && diferencia <= 1 &&
			anterior.getMonto() > 2)
				return true;				
		}
		
		return false;
	}
}
