package pagamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

public class PagamentoTest {
	
	@Test
	public void pagarBoleto() {
		Pagamento pag = new Pagamento();
		float valorPago = 0;
		Boleto boleto1 = new Boleto(123, new java.util.Date(01-02-2020), 200);
		valorPago = pag.pagarBoleto(boleto1);
		Assertions.assertEquals(valorPago, boleto1.getValPago());
	}

}
