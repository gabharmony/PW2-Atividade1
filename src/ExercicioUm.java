import java.text.DateFormatSymbols;
import java.util.Date;

import javax.print.attribute.DateTimeSyntax;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class ExercicioUm {

	public static boolean ehDiaSemana(String dia) {
		
		if (dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sábado")) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
	
	public static void main(String[] args) {

		boolean diaValido =  ehDiaSemana("domingo");
		System.out.println("É dia da Semana: " + diaValido);

	}

}
