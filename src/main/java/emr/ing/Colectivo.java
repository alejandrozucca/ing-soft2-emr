package emr.ing;

public class Colectivo {
	
	private String empresa;
	private int interno;
	
	public Colectivo(String empresa, int interno) {
		
		this.empresa = empresa;
		this.interno = interno;
	}

	public String getEmpresa() {
		return empresa;
	}

	public int getInterno() {
		return interno;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setInterno(int interno) {
		this.interno = interno;
	}

}
