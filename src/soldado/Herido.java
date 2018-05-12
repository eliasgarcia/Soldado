package soldado;

public class Herido implements EstadoSoldado{

	@Override
	public void recibirDisparo(Soldado soldado) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaah!!");
		soldado.setCantidadSangre(0);
		soldado.setCantidadAgujeros(soldado.getCantidadAgujeros()+1);
		soldado.setEstadoSoldado(new Muerto());		
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("gracias");
		soldado.setCantidadAgujeros(Math.max(0, soldado.getCantidadAgujeros()-1));
		soldado.setEstadoSoldado(new Saludable());		
	}

}
