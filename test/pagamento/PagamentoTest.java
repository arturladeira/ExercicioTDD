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
	
	@Test
	public void pagarDoisBoletos() {
		Pagamento pag = new Pagamento();
		float valorPago = 0;
		Boleto boleto1 = new Boleto(123, new java.util.Date(01-02-2020), 200);
		Boleto boleto2 = new Boleto(1234, new java.util.Date(02-02-2020), 300);
		valorPago = pag.pagarBoleto(boleto1);
		valorPago = pag.pagarBoleto(boleto2);
		Assertions.assertEquals(500, valorPago);
	}

}
