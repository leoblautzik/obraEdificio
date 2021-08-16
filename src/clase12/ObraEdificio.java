package clase12;

public class ObraEdificio {
	
	private int superficieTotalAcimentar;
	private int superficieCimetada;
	
	public ObraEdificio(int superficieTotalAcimetar) {
		if (superficieTotalAcimetar <= 0)
			throw new Error("La superficie debe ser mayor a 0");
		this.superficieTotalAcimentar = superficieTotalAcimetar;
		this.superficieCimetada = 0;
	}
	
	public void cimentando(int superficieAcimentar) {
		if(this.superficieCimetada + superficieAcimentar > this.superficieTotalAcimentar)
			throw new Error("La superficie a cimentar excede el valor permitido");
		this.superficieCimetada += superficieAcimentar;
	}
	
	public int restaPorCimentar() {
		return this.superficieTotalAcimentar - this.superficieCimetada;
	}
	
	public boolean terminado() {
		return this.superficieTotalAcimentar == this.superficieCimetada;
	}
	

}
