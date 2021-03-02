package boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoletoTest {
	
	@Test
	public void verificaValorPago() {
		
		Boleto bol = new Boleto(200);
		Assertions.assertEquals(200, bol.getValPago());
		
	}

}
