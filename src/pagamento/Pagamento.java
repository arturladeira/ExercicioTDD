package pagamento;

import java.util.ArrayList;

import boleto.Boleto;

public class Pagamento {

	private ArrayList boletos;
	private String Status;
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public float pagarBoleto(Boleto boleto) {
		return boleto.getValPago();
	}
}
