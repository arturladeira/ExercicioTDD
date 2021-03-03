package fatura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fatura.Fatura;

public class FaturaTest {
	
	
	@Test
	public void verificaValorTotal() {
		Fatura bol = new Fatura();
		Assertions.assertEquals(200, bol.getValTotal());
	}
	
	
	

}
