package pagamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;

public class PagamentoTest {
	
	@Test
	public void adicionarBoleto() {
		Pagamento pag = new Pagamento();
		Boleto boleto1 = new Boleto(123, new Date(), 200);
		pag.addBoleto(boleto1);
		assertTrue(pag.getQtdeItems() == 1);
	}
	
	@Test
	public void pagarUmBoleto() {
		Pagamento pag = new Pagamento();
		double valorPago = 0;
		Boleto boleto1 = new Boleto(123, new Date(), 200);
		pag.addBoleto(boleto1);
		valorPago = pag.pagarBoleto();
		Assertions.assertEquals(valorPago, boleto1.getValPago());
	}
	
	@Test
	public void pagarDoisBoletos() {
		Pagamento pag = new Pagamento();
		double valorPago = 0;
		Boleto boleto1 = new Boleto(123, new Date(), 200);
		Boleto boleto2 = new Boleto(1234, new Date(), 300);
		pag.addBoleto(boleto1);
		pag.addBoleto(boleto2);
		valorPago = pag.pagarBoleto();
		Assertions.assertEquals(500, valorPago);
	}
	
	@Test
	public void pagarFatura() {
		Pagamento pag = new Pagamento();
		Fatura fat = new Fatura("Artur", new Date(), 600);
		double valorPago = 0;
		pag.addBoleto(new Boleto(123, new Date(), 200));
		pag.addBoleto(new Boleto(1234, new Date(), 300));
		valorPago = pag.pagarBoleto();
		Assertions.assertEquals(pag.getStatus(valorPago, fat.getValTotal()), "ABERTO");
	}

}
