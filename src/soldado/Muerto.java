package soldado;

public class Muerto implements EstadoSoldado{

	@Override
	public void recibirDisparo(Soldado soldado) {
		soldado.setCantidadAgujeros(soldado.getCantidadAgujeros()+1);		
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("he revivido!");
		soldado.setCantidadSangre(5000);
		soldado.setCantidadAgujeros(0);
		soldado.setEstadoSoldado(new Saludable());		
	}

}
