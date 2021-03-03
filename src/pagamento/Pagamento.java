package pagamento;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;


public class Pagamento {

	private ArrayList boletos;
	private String status;
	
	public void addBoleto(ArrayList<Boleto> boletoList) {
		boletos.add(boletoList);
	}
	
	public Pagamento() {
		super();
		boletos = new ArrayList();
		this.status = "ABERTO";
	}
	
	
	public double pagarBoleto(ArrayList<Boleto> boletos) {
		double valorPago = 0;
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			valorPago += boleto.getValPago();
		}
		
		return valorPago;
	}
	public String getStatus(double valorPago, double valorTotal){
		Pagamento pag = new Pagamento();
		if (valorPago < valorTotal) {
			pag.status = "ABERTO";
			return pag.status;
		} else {
			pag.status = "PAGO";
			return pag.status;
		}	
	}
	
	public int getQtdeItems() {
		return boletos.size();
	}
}
