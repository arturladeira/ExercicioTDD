package pagamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;

public class PagamentoTest {
	
	Pagamento pag;
	ArrayList<Boleto> boletoList;
	
	@BeforeEach
	public void init() {
		pag = new Pagamento();
		boletoList = new ArrayList<Boleto>();
	}
	
	@Test
	public void adicionarBoleto() {
		
		Boleto boleto1 = new Boleto(123, new Date(), 200);
		pag.addBoleto(boleto1);
		assertTrue(pag.getQtdeItems() == 1);
	}
	
	@Test
	public void pagarUmBoleto() {
		
		double valorPago = 0;
		Boleto boleto1 = new Boleto(123, new Date(), 200);
		pag.addBoleto(boleto1);
		valorPago = pag.pagarBoleto();
		Assertions.assertEquals(valorPago, boleto1.getValPago());
	}
	
	@DisplayName("Testa o somatório dos valores dos boleto e o pagamento dos boletos")
	@Test
	public void pagarMaisBoletos() {
		double valorPago = 0;
		double valorTotalBoleto = 0;
		boletoList.add(new Boleto(123, new Date(), 200));
		boletoList.add(new Boleto(1234, new Date(), 300));
		pag.addBoleto(boletoList);
		valorPago = pag.pagarBoleto(boletoList);
		for (Boleto boleto : boletoList) {
			valorTotalBoleto += boleto.getValPago();
		}
		
		Assertions.assertEquals(valorTotalBoleto, valorPago);
	}
	
	@Test
	public void pagarFatura() {
		
		Fatura fat = new Fatura("Artur", new Date(), 600);
		double valorPago = 0;
		pag.addBoleto(new Boleto(123, new Date(), 200));
		pag.addBoleto(new Boleto(1234, new Date(), 300));
		valorPago = pag.pagarBoleto();
		Assertions.assertEquals(pag.getStatus(valorPago, fat.getValTotal()), "ABERTO");
	}

}
