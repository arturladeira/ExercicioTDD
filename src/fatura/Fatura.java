package fatura;

import java.util.Date;

public class Fatura {
	
	private String cliente;
	private Date dataFat;
	private double valTotal;
	
	public Fatura (String cliente, Date dataFat, double valTotal ) {
		super();
		this.cliente = cliente;
		this.dataFat = dataFat;
		this.valTotal = valTotal;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		cliente = cliente;
	}
	public Date getDataFat() {
		return dataFat;
	}
	public void setDataFat(Date dataFat) {
		this.dataFat = dataFat;
	}
	public double getValTotal() {
		return valTotal;
	}
	public void setValTotal(double valTotal) {
		this.valTotal = valTotal;
	}
	

}
