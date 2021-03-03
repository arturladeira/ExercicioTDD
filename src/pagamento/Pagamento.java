package pagamento;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;


public class Pagamento {

	private ArrayList boletos;
	private String Status;
	
	
	public Pagamento() {
		boletos = new ArrayList();
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	public double pagarBoleto() {
		double valorPago = 0;
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			valorPago += boleto.getValPago();
		}
		
		return valorPago;
	}
}
