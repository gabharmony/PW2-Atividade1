
public class ExercicioDois {

	public static void main(String[] args) {

		boolean diaHoraValido = possoIrBanco("Quarta", 17);

		System.out.println("Posso ir ao Banco: " + diaHoraValido);

	}

	public static boolean possoIrBanco(String dia, int hora) {
		
		return ExercicioUm.ehDiaSemana(dia) && hora >= 10 && hora <= 16;

		//return ! (dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("s�bado") || hora <= 10 || hora >= 16);

	}

}
