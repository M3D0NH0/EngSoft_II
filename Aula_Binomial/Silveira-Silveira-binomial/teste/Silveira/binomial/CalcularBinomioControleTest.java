package Silveira.binomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularBinomioControleTest {

	@Test
	public void testSeisDois() {
		IBinomioEntidade e = new BinomioEntidadeFake(6,2,15);
		CalcularBinomioControle c;
		c = new CalcularBinomioControle(e);
		int actual = c.calcular(6,2);
		int expected = 15;
		assertEquals(expected , actual);
		
	}
	@Test
	public void testUmUm() {
		IBinomioEntidade e = new BinomioEntidadeFake(1,1,1);
		CalcularBinomioControle c;
		c = new CalcularBinomioControle(e);
		int actual = c.calcular(1,1);
		int expected = 1;
		assertEquals(expected , actual);
		
	}
	
	

}
