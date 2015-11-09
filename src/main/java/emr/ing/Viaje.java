package emr.ing;

import java.util.Date;

public class Viaje {
	
	private double monto;
	private Colectivo colectivo;
	private Date horario;	
	
	public Viaje(double monto, Colectivo colectivo, Date horario){
		this.monto = monto;
		this.colectivo = colectivo;
		this.horario = horario;
	}

	public double getMonto() {
		return monto;
	}

	public Colectivo getColectivo() {
		return colectivo;
	}

	public Date getHorario() {
		return horario;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

}
