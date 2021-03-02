package boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoletoTest {
	
	@Test
	public void verificaValorPago() {
		Boleto bol = new Boleto(123, new java.util.Date(01-02-2020), 200 );
		Assertions.assertEquals(200, bol.getValPago());
	}
	
	@Test
	public void verificaData() {
		Boleto bol = new Boleto(123, new java.util.Date(01-02-2020), 200 );
		Assertions.assertEquals(01-02-2020, bol.getDataBol());
	}

}
