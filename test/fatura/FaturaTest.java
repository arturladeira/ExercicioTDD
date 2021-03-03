package fatura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;
import fatura.Fatura;

public class FaturaTest {
	
	
	@Test
	public void verificaValorTotal() {
		Fatura bol = new Fatura("Artur", new java.util.Date(01-02-2020), 201);
		Assertions.assertEquals(201, bol.getValTotal());
	}
	
	@Test
	public void verificaCliente() {
		Fatura bol = new Fatura("Artur", new java.util.Date(01-02-2020), 201);
		Assertions.assertEquals("Artur", bol.getCliente());
	}
	
	
	

}
