package Exercicios;

class DNI {
	private char[] asignacionLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public boolean eValido(String numeroLetra) {

		if (numeroLetra.length() != 9 || Character.isLetter(numeroLetra.charAt(9)) == false) {
			return false;
		}
		String numero = numeroLetra.substring(0, 8);
		char letraMayuscula = numeroLetra.charAt(9);
		char miLetra;
		miLetra = asignacionLetra[calculaLetra(numero)];
		if (soloNumeros(numeroLetra) == true && miLetra == letraMayuscula) {
			return true;
		} else {
			return false;
		}
	}

	private boolean soloNumeros(String numeroLetra) {
		int i, j = 0;

		String numero = "";
		String miDNI = "";
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < numeroLetra.length() - 1; i++) {
			numero = numeroLetra.substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	private int calculaLetra(String numero) {
		int numeroInt = Integer.parseInt(numero);
		int resto = 0;

		resto = numeroInt % 23;

		return resto;
	}
}