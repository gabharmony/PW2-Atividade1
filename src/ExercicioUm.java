import java.text.DateFormatSymbols;
import java.util.Date;

import javax.print.attribute.DateTimeSyntax;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class ExercicioUm {

	public static boolean ehDiaSemana(String dia) {
		
		if (dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("s�bado")) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
	
	public static void main(String[] args) {

		boolean diaValido =  ehDiaSemana("domingo");
		System.out.println("� dia da Semana: " + diaValido);

	}

}
