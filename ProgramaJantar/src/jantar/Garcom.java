package jantar;

import java.util.Calendar;

public class Garcom {
	
	String pergBoasVindas = "";
	String pergCardapioEnt = "";
	String pergCardapioPrat = "";
	String pergCardapioSob = "";
	String pergBebidas = "";
	
	
		
		Calendar horaAtual = Calendar.getInstance();

		String recepcao ;
		
		{
		
		if ( horaAtual.get(Calendar.HOUR_OF_DAY) > 0 && horaAtual.get(Calendar.HOUR_OF_DAY) <= 11 ) {
			recepcao = "Bom dia"; }
			
		else if ( horaAtual.get(Calendar.HOUR_OF_DAY) > 11 && horaAtual.get(Calendar.HOUR_OF_DAY) <= 18 ) {
			recepcao = "Boa Tarde"; }

		else { recepcao = "Boa Noite";}

		}
	
		
		
		
	}
	
	
