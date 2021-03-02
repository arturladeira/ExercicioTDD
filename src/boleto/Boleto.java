package boleto;
import java.util.Date;

public class Boleto {
	private int codBarras;
	private Date dataBol;
	private float valPago;
	
	public Boleto ( float valPago) {
		super();
		
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
	public float getValPago() {
		return valPago;
	}
	public void setValPago(float valPago) {
		this.valPago = valPago;
	}
	
}
