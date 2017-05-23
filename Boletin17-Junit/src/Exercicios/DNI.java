package Exercicios;
/**
 * Principal.java
 * @author Brais Garrido Blanco
 */

import java.util.ArrayList;

public class DNI {
	private char[] asignacionLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
	/**
	 * M�todo que verifica que o DNI � v�lido
	 * @param numeroLetra Par�metro que indica o DNI
	 * @return Un valor que nos indica si � v�lido ou non
	 */

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
	
	/**
	 * M�todo que indica que o n�mero de caracteres introducido � correcto
	 * @param numeroLetra Par�metro que indica o DNI
	 * @return Un valor que nos indica que si � v�lido ou non 
	 */
	
	public boolean soloNumeros(String numeroLetra) {
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
	
	/**
	 * M�todo que devolve o n�mero de DNI dividido entre 23
	 * @param numero Par�metro que indica o DNI
	 * @return O valor introducido dividido por 23
	 */
	
	public int calculaLetra(String numero) {
		int numeroInt = Integer.parseInt(numero);
		int resto = 0;

		resto = numeroInt % 23;

		return resto;
	}
	/**
	 * M�todo que indica si o DNI � v�lido
	 * @param numeros Par�metro que nos indica o DNI
	 * @param letra Par�metro que nos indica a letra do DNI
	 * @return Un boolean que indica si o DNI � v�lido
	 */
	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		if (numeros.size() == 8) {
			for (int i = 0; i < numeros.size(); i++)
				if (numeros.get(i) > 9)
					return false;
			int modulo = calculaLetra(numeros);
			if (asignacionLetra[modulo] == letra)
				return true;
			else
				return false;
		} else
			return false;
	}
	/**
	 * M�todo que divide o n�mero do DNI entre 23
 	 * @param numeros Par�metro que nos indica o n�mero do DNI
	 * @return O n�mero de DNI dividido entre 23
	 */
	public int calculaLetra(ArrayList<Integer> numeros) {
		int modulo;
		int numEntero = 0;

		if (numeros.size() == 8) {
			for (int i = 0; i < numeros.size(); i++)
				if (numeros.get(i) > 9)
					return -1;
			for (int i = 0; i < 8; i++)
				numEntero = numEntero+(numeros.get(i)*(int)Math.pow(10, (7-i)));
			modulo = numEntero % 23;
			return modulo;
		} else
			return -1;
	}
}