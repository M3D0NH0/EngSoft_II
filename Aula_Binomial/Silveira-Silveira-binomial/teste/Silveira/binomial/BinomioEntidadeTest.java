package Silveira.binomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinomioEntidadeTest {

	@Test
	public void test() {
		
		BinomioEntidade e = new BinomioEntidade();
		e.setN(6);
		e.setK(2);
		int actual = e.getCoeficiente();
		int expected = 15;
		
		assertEquals(expected , actual);
		
	}
	
	

}
