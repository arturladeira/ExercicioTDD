package boleto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Boleto {
	private int codBarras;
	private Date dataBol;
	private double valPago;
	
	public Boleto (int codBarras, Date dataBol, double valPago) {
		super();
		this.codBarras = codBarras;
		this.dataBol = dataBol;
		this.valPago = valPago;
	}

	
	public int getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}
	public Date getDataBol() {
		return dataBol;
	}
	public void setDataBol(Date dataBol) {
		this.dataBol = dataBol;
	}
	public double getValPago() {
		return valPago;
	}
	public void setValPago(double valPago) {
		this.valPago = valPago;
	}
	
}
