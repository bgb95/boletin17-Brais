package Exercicios;

public class DNI {
	//private String[] letraDNI = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
			//"V", "H", "L", "C", "K", "E" };

	public boolean eValido(String numeroLetra) {
		if (numeroLetra.length() == 9) {
			char[] arrayChar = numeroLetra.toCharArray();
			for (int i = 0; i <= arrayChar.length; i++) {
				if (i < 8)
					if (arrayChar[i] < '1' && arrayChar[i] > '9')
						return false;
				if (i == 8)
					if (arrayChar[i] < 'A' && arrayChar[i] < 'Z')
						return false;
			}
			return true;
		} else
			return false;
	}

}