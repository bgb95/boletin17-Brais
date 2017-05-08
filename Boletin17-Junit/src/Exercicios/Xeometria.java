package Exercicios;

public class Xeometria {

	public int perímetroCadrado(int lado) {
		if (lado < 0)
			return 0;
		else
			return lado * 4;
	}
}