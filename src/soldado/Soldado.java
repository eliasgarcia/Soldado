package soldado;

public class Soldado {

	private double cantidadSangre;
	private int cantidadAgujeros;
	private EstadoSoldado estadoSoldado;
	
	public Soldado(){
		cantidadSangre = 5000;
		cantidadAgujeros = 0;
		estadoSoldado = new Saludable();
	}
	
	public void recibirDisparo() {
		estadoSoldado.recibirDisparo(this);
	}

	public void recibirCuracion() {
		estadoSoldado.recibirCuracion(this);		
	}	
	public double getCantidadSangre() {
		return cantidadSangre;
	}

	public void setCantidadSangre(double cantidadSangre) {
		this.cantidadSangre = cantidadSangre;
	}

	public int getCantidadAgujeros() {
		return cantidadAgujeros;
	}

	public void setCantidadAgujeros(int cantidadAgujeros) {
		this.cantidadAgujeros = cantidadAgujeros;
	}

	public EstadoSoldado getEstadoSoldado() {
		return estadoSoldado ;
	}
	
	public void setEstadoSoldado(EstadoSoldado estadoSoldado) {
		this.estadoSoldado = estadoSoldado;
	}
	
	
	
}
