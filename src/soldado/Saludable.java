package soldado;

public class Saludable implements EstadoSoldado{

	@Override
	public void recibirDisparo(Soldado soldado) {
		System.out.println("aaaaaaaaah!!");
		soldado.setCantidadSangre(Math.max(0, soldado.getCantidadSangre()-100));
		soldado.setCantidadAgujeros(soldado.getCantidadAgujeros()+1);
		soldado.setEstadoSoldado(new Herido());
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("gracias, pero estoy saludable!");		
	}

}
