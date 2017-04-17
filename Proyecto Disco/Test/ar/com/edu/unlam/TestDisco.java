package ar.com.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {
	
	
	@Test
	public void testQueCambiaelRadioInteriorDelDisco()
	{
		Disco MiDisco=new Disco();
		
		MiDisco.setRadioInterior(4.0);
		
		Double ValorActual=MiDisco.getRadioInterior();
		
		assertEquals(4.0, ValorActual, 0.01);
	
	}
	
	
	@Test
	public void testQueCambiaelRadioExteriorDelDisco()
	{
		Disco MiDisco=new Disco();
		
		MiDisco.setRadioExterior(6.0);
		
		Double ValorActual=MiDisco.getRadioExterior();
		
		assertEquals(6.0, ValorActual, 0.01);
	
	}
	
	

	@Test
	public void testQueCalculaLaSuperficieDelDisco() {
		
		Disco MiDisco=new Disco(2.0,3.0);
		Double ValorActual=MiDisco.calcularSuperficie();
		
		assertEquals(15.7, ValorActual, 0.01);
	
	}
	
	@Test
	public void testQueCalculaElPerimetroInterior() {
		
		Disco MiDisco=new Disco(2.0,3.0);
		Double ValorActual=MiDisco.perimetroInterior();
		
	assertEquals(12.57, ValorActual, 0.01);
	
	}
	
	@Test
	public void testQueCalculaElPerimetroExterior() {
		
		Disco MiDisco=new Disco(2.0,3.0);
		Double ValorActual=MiDisco.perimetroExterior();
		
	assertEquals(18.85, ValorActual, 0.01);
	
	}
	
	
	

}