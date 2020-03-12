
public class ExercicioDois {

	public static void main(String[] args) {

		boolean diaHoraValido = possoIrBanco("Quarta", 18);

		System.out.println("Posso ir ao Banco: " + diaHoraValido);

	}

	public static boolean possoIrBanco(String dia, int hora) {

		return ! (hora < 10 || hora > 16 || dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sábado"));

	}

}
