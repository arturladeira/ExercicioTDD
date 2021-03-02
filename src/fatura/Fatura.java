package fatura;

import java.util.Date;

public class Fatura {
	
	private String Cliente;
	private Date dataFat;
	private float valTotal;
	
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public Date getDataFat() {
		return dataFat;
	}
	public void setDataFat(Date dataFat) {
		this.dataFat = dataFat;
	}
	public float getValTotal() {
		return valTotal;
	}
	public void setValTotal(float valTotal) {
		this.valTotal = valTotal;
	}
	

}
