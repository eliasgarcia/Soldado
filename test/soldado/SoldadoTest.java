package soldado;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoldadoTest {

	private Soldado soldado;
	
	@Before
	public void before() {
		soldado = new Soldado();
	}
	
	@Test
	public void recibirDisparoEstandoSaludable() {
		soldado.recibirDisparo();
		Assert.assertEquals(4900, soldado.getCantidadSangre(),1);
		Assert.assertEquals(1, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Herido);
	}
	
	@Test
	public void recibirCuracionEstandoSaludable() {
		soldado.recibirCuracion();
		Assert.assertEquals(5000, soldado.getCantidadSangre(),1);
		Assert.assertEquals(0, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Saludable);
	}
	
	@Test
	public void recibirDisparoEstandoHerido() {
		soldado.recibirDisparo();//pasara a Herido
		soldado.recibirDisparo();
		Assert.assertEquals(0, soldado.getCantidadSangre(),1);
		Assert.assertEquals(2, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Muerto);
	}
	
	@Test
	public void recibirCuracionEstandoHerido() {
		soldado.recibirDisparo();//pasara a Herido
		soldado.recibirCuracion();
		Assert.assertEquals(4900, soldado.getCantidadSangre(),1);
		Assert.assertEquals(0, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Saludable);
	}

	@Test
	public void recibirDisparoEstandoMuerto() {
		soldado.recibirDisparo();//pasara a Herido
		soldado.recibirDisparo();//pasara a Muerto
		soldado.recibirDisparo();
		Assert.assertEquals(0, soldado.getCantidadSangre(),1);
		Assert.assertEquals(3, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Muerto);
	}
	
	@Test
	public void recibirCuracionEstandoMuerto() {
		soldado.recibirDisparo();//pasara a Herido
		soldado.recibirDisparo();//pasara a Muerto
		soldado.recibirCuracion();
		Assert.assertEquals(5000, soldado.getCantidadSangre(),1);
		Assert.assertEquals(0, soldado.getCantidadAgujeros());
		Assert.assertTrue(soldado.getEstadoSoldado() instanceof Saludable);
	}
}
