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
	
	@DisplayName("Adiciona um boleto na lista de pagamento")
	@Test
	public void adicionarBoleto() {
		boletoList.add(new Boleto(123, new Date(), 200));
		pag.addBoleto(boletoList);
		assertTrue(pag.getQtdeItems() == 1);
	}
	
	@DisplayName("Pagamento de um boleto")
	@Test
	public void pagarUmBoleto() {
		double valorPago = 0;
		double valorTotalBoleto = 0;
		boletoList.add(new Boleto(123, new Date(), 200));
		valorPago = pag.pagarBoleto(boletoList);
		pag.addBoleto(boletoList);
		for (Boleto boleto : boletoList) {
			valorTotalBoleto += boleto.getValPago();
		}
		Assertions.assertEquals(valorPago, valorTotalBoleto);
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
	
	@DisplayName("Testa o status da fatura para pagamento menores de fatura")
	@Test
	public void pagarFatura() {
		Fatura fat = new Fatura("Artur", new Date(), 600);
		double valorPago = 0;
		boletoList.add(new Boleto(123, new Date(), 200));
		boletoList.add(new Boleto(1234, new Date(), 300));
		valorPago = pag.pagarBoleto(boletoList);
		Assertions.assertEquals(pag.getStatus(valorPago, fat.getValTotal()), "ABERTO");
	}

}
