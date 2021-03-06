package boleto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoletoTest {
	
	@Test
	public void verificaValorPago() {
		Boleto bol = new Boleto(123, new java.util.Date(01-02-2020), 200 );
		Assertions.assertEquals(200, bol.getValPago());
	}
	
	/*@Test
	public void verificaData() {
		Boleto bol = new Boleto(123, new java.util.Date(17/07/1989), 200 );
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date date1 = dateformat.parse("17/07/1989");
		} catch (ParseException e){
			 e.printStackTrace();
		}
		DateFormat formatadorDeData = new SimpleDateFormat("dd-MM-yyyy");
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Assertions.assertEquals(01-02-2020, bol.getDataBol());
	}*/
	
	@Test
	public void verificaCodBarras() {
		Boleto bol = new Boleto(123, new java.util.Date(01-02-2020), 200 );
		Assertions.assertEquals(123, bol.getCodBarras());
	}

}
